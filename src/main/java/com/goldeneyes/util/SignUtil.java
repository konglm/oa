//package com.goldeneyes.util;
//
//import javax.crypto.Mac;
//import javax.crypto.spec.SecretKeySpec;
//
//import com.alibaba.fastjson.JSONObject;
//
//import java.nio.charset.StandardCharsets;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.Base64;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.TreeMap;
//import com.alibaba.fastjson.JSON;
//import java.util.Optional;
//import com.alibaba.fastjson.parser.Feature;
//
//public class SignUtil {
//	
//	public static String getSignResult(String bodyJson) {
//		String newSign = "";
//		JSONObject jsonObject = JSON.parseObject(bodyJson, JSONObject.class, Feature.IgnoreNotMatch);
//		if (jsonObject != null && jsonObject.size() > 0) {
//			String sign = Optional.ofNullable(jsonObject.remove("sign")).orElse("").toString();
//			newSign = SignUtil.getSign(jsonObject);
//			System.out.println("newSign===" + newSign);
//		}
//		return newSign;
//	}
//
//    public static String getSign(Map<String, Object> paraMap) {
//        String sign = null;
//
//        SecretKeySpec secretKeySpec = new SecretKeySpec(CommonTool.getProp("signKey").getBytes(StandardCharsets.UTF_8), "HmacSHA1");
//        Mac mac;
//        try {
//            mac = Mac.getInstance("HmacSHA1");
//            mac.init(secretKeySpec);
//        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
//            throw new RuntimeException();
//        }
//
//        String key;
//        Object value;
//        StringBuilder sb = new StringBuilder();
//        TreeMap<String, Object> paraTreeMap = new TreeMap<>(paraMap);
//        for (Map.Entry<String, Object> entry : paraTreeMap.entrySet()) {
//            key = entry.getKey();
//            value = entry.getValue();
//            if (value == null) {
//                value = "";
//            }
//            sb.append(key).append("=").append(value).append("&");
//        }
//
//        if (sb.length() > 0) {
//            String queryParas = sb.substring(0, sb.length() - 1);
//            sign = Base64.getEncoder().encodeToString(mac.doFinal(queryParas.getBytes(StandardCharsets.UTF_8)));
//        }
//        return sign;
//    }
//
//}
