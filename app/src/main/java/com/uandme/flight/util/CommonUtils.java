package com.uandme.flight.util;

import android.content.Context;
import com.uandme.flight.entity.LoginUserInfo;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class CommonUtils {
	
	public static String xml2JSON(String xml) {
		try {
			JSONObject obj = XML.toJSONObject(xml);
			return obj.toString();
		} catch (JSONException e) {
			System.err.println("net" + e.getLocalizedMessage());
			return "";
		}
	}

}
