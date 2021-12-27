/*----------------------------------------------------------------
 *  Copyright (C) 2017山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：
 * 文件功能描述：
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package com.goldeneyes.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goldeneyes.service.AffairApproveService;
import com.goldeneyes.service.AnnouncementService;
import com.goldeneyes.service.CooperateNoticeService;
import com.goldeneyes.service.InfoCollectService;
import com.goldeneyes.service.NoticeLetterService;
import com.goldeneyes.service.NoticeService;
import com.goldeneyes.service.PublicService;
import com.goldeneyes.util.CommonTool;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/")
public class CommonController {
	@Resource
	AffairApproveService affairApproveService;
	@Resource
	NoticeService noticeService;
	@Resource
	CooperateNoticeService cooperateNoticeService;
	@Resource
	InfoCollectService infoCollectService;
	@Resource
	AnnouncementService announcementService;
	@Resource
	PublicService publicService;
	@Resource
	NoticeLetterService noticeLetterService;
	
	/**
	 * 工作流红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaApprove")
	public void getDotNumOaApprove(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
//			System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				//System.out.println(e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noApproveCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo1 = new JSONObject();
					noApproveCnt = affairApproveService.getNoApproveCntByMan(unit_code, user_code);
					jo1.put("access", accesss);
					jo1.put("dotnum", noApproveCnt);
					jsonList.add(jo1);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 通知红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaNotice")
	public void getDotNumOaNotice(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noReadCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo2 = new JSONObject();
					noReadCnt = noticeService.getNoReadCntByMan(unit_code, user_code);		
					jo2.put("access", accesss);
					jo2.put("dotnum", noReadCnt);
					jsonList.add(jo2);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 事务红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaCooperateNotice")
	public void getDotNumOaCooperateNotice(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noDoneCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo3 = new JSONObject();
					noDoneCnt = cooperateNoticeService.getNoDoneCntByMan(unit_code, user_code);		
					jo3.put("access", accesss);
					jo3.put("dotnum", noDoneCnt);
					jsonList.add(jo3);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 事务红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaNewCooperateNotice")
	public void getDotNumOaNewCooperateNotice(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noDoneCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo3 = new JSONObject();
					noDoneCnt = cooperateNoticeService.getNewNoReadCntByMan(unit_code, user_code);		
					jo3.put("access", accesss);
					jo3.put("dotnum", noDoneCnt);
					jsonList.add(jo3);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 事务红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaCooperateNotice4App")
	public void getDotNumOaCooperateNotice4App(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noDoneCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo3 = new JSONObject();
					noDoneCnt = cooperateNoticeService.getNoDoneCntByMan(unit_code, user_code) + cooperateNoticeService.getNewNoReadCntByMan(unit_code, user_code);		
					jo3.put("access", accesss);
					jo3.put("dotnum", noDoneCnt);
					jsonList.add(jo3);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 资料收集红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaDataCollection")
	public void getDotNumOaDataCollection(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noUploadCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					JSONObject jo4 = new JSONObject();
					noUploadCnt = infoCollectService.getNoUploadCntByMan(unit_code, user_code);		
					jo4.put("access", accesss);
					jo4.put("dotnum", noUploadCnt);
					jsonList.add(jo4);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 公告+校历+周程红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaAllAnnouncement")
	public void getDotNumOaAllAnnouncement(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noCheckCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					int isCheckMan = 0;
					isCheckMan = publicService.getIsCheckManByCondition(unit_code, 1, user_code);
							
					JSONObject jo4 = new JSONObject();
					
					if(isCheckMan != 0) {
						noCheckCnt = announcementService.getCheckAnnouncementCnt(unit_code, "", 1, "19000101", "30000101", 0, "");
					}
					jo4.put("access", accesss);
					jo4.put("dotnum", noCheckCnt);
					jsonList.add(jo4);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
	
	/**
	 * 工资条红点
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("/getDotNumOaNoticeLetter")
	public void getDotNumOaNoticeLetter(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 返回参数用
		JSONObject jsonData = new JSONObject();

//		Map<String, String> attrs = CommonTool.getParamByGet(request);
		JSONObject jsonInput = new JSONObject(true);
		String requestStr = "";
		try {
			requestStr = CommonTool.getRequestPostStr(request);
			//System.out.println(requestStr);
			jsonInput = JSONObject.fromObject(requestStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		}

		// 判断验证参数是否传递过来
		if (!jsonInput.has("unit_code") || !jsonInput.has("user_code") || !jsonInput.has("access_token")
				|| !jsonInput.has("numtp") || !jsonInput.has("sign") || !jsonInput.has("app_code")
				|| !jsonInput.has("platform_code")  || !jsonInput.has("index_code")) {
//		if (!attrs.containsKey("unit_code") || !attrs.containsKey("user_code") || !attrs.containsKey("accesss") || !attrs.containsKey("access_token")
//				|| !attrs.containsKey("numtp") || !attrs.containsKey("sign")) {
			CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1004").toString());
		} else {
			// 排序参数
			String encryptText = "";
			try {
				TreeMap treeMap = CommonTool.sortJsonObject(jsonInput);

				Iterator it = treeMap.keySet().iterator();
				while (it.hasNext()) {  
		            String keyt = it.next().toString();  
		            String valuet = treeMap.get(keyt).toString();
					if (!keyt.equals("sign")) {
						encryptText = encryptText + keyt + "=" + valuet + "&";
					}
				}
				encryptText = encryptText.substring(0, encryptText.length() - 1);
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1011").toString());
			}
			// 验证url是否被篡改
			String sign = CommonTool.getSign(encryptText);
			if (!sign.equals(jsonInput.getString("sign"))) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1008").toString());
			}
			
			String unit_code = "";
			Long user_code = 0l;
			int numtp = 0;
			String accesss = "";
			
			try {
				unit_code = jsonInput.getString("unit_code");
				user_code = Long.parseLong(jsonInput.getString("user_code"));
				numtp = Integer.parseInt(jsonInput.getString("numtp"));
				accesss = jsonInput.getString("app_code") + jsonInput.getString("index_code");
			} catch (Exception e) {
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1003").toString());
				return;
			}

			int noCheckCnt = 0;
			JSONArray jsonList = new JSONArray();
			try {
				if(numtp == 0) {
					int isCheckMan = 0;
					isCheckMan = publicService.getIsCheckManByCondition(unit_code, 2, user_code);
					
					JSONObject jo4 = new JSONObject();
					if(isCheckMan != 0) {
						noCheckCnt = noticeLetterService.getCheckNoticeLetterCnt(unit_code, "", 1, 1, "19000101", "30000101");		
					}
					jo4.put("access", accesss);
					jo4.put("dotnum", noCheckCnt);
					jsonList.add(jo4);
				}
				
				jsonData.put("list", jsonList);
				// 在这里输出，手机端就拿到web返回的值了
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "0000").toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				jsonData.put("errormsg", e.getMessage());
				CommonTool.outJsonString(response, CommonTool.outJson(jsonData, "1013").toString());
				return;
			}

		}
	}
}
