package com.example.demo.reqres;

import java.util.ArrayList;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;


public class RequestPayload {
	private HttpServletRequest httpServletRequest;
//	private ArrayList<String> key = new ArrayList<String>();
	
	private JsonNode data;

	public RequestPayload(HttpServletRequest httpServletRequest, JsonNode data) {
		super();
		this.httpServletRequest = httpServletRequest;
//		this.key = key;
		this.data = data;
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

//	public ArrayList<String> getKey() {
//		return key;
//	}
//
//	public void setKey(ArrayList<String> key) {
//		this.key = key;
//	}

	public JsonNode getData() {
		return data;
	}

	public void setData(JsonNode data) {
		this.data = data;
	}
	
	public String toString() {
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("data", this.data);
		return jsonobj.toString();
	}
	
}
