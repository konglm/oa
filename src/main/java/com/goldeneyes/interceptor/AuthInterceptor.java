/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：AuthInterceptor
 * 文件功能描述：验证拦截器
 *
 * 
 * 创建标识：konglm20161108
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package com.goldeneyes.interceptor;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.goldeneyes.service.OutInterfaceService;
import com.goldeneyes.util.CommonTool;
import com.goldeneyes.util.EncryptUtil;

import net.sf.json.JSONObject;

/**
 * @author konglm
 *
 */
public class AuthInterceptor implements HandlerInterceptor {	
	@Resource
	OutInterfaceService outInterfaceService;

	/**
	 * @author konglm
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("===========================Interceptor===================================");
		JSONObject jsonData = new JSONObject();
		JSONObject jsonInput = new JSONObject(true);
		//System.out.println(request.getServletPath());
		// 接收APP端发来的json请求
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
			return false;
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("sign") || !jsonInput.has("access_token") || !jsonInput.has("platform_code") || !jsonInput.has("app_code")
				|| !jsonInput.has("unit_code") || !jsonInput.has("index_code") || !jsonInput.has("op_code")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			return false;
		}

		// 排序参数
		String encryptText = "";
		try {
			TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

			Iterator it = treeMap.keySet().iterator();
			while (it.hasNext()) {  
	            String keyt = it.next().toString();  
	            String valuet = "";
	            if (treeMap.get(keyt) != null) {
	            	valuet = treeMap.get(keyt).toString();
	            }
				if (!keyt.equals("sign")) {
					encryptText = encryptText + keyt + "=" + valuet + "&";
				}
			}
			encryptText = encryptText.substring(0, encryptText.length() - 1);
		} catch (Exception e) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			return false;
		}
		// 验证url是否被篡改
		String sign = CommonTool.getSign(encryptText);
		
		if (!sign.equals(jsonInput.getString("sign"))) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			return false;
		}

		request.setAttribute("requestStr", requestStr);
		return true;
	}

	/**
	 * @author konglm
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * @author konglm
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
