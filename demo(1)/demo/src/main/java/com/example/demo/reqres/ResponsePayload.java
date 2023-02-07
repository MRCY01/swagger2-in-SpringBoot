package com.example.demo.reqres;

import com.fasterxml.jackson.databind.JsonNode;

import org.json.JSONObject;

public class ResponsePayload {
	
	JSONObject data;
	
	public ResponsePayload() {
		data = new JSONObject();
	}


	public JSONObject getData() {
		return data;
	}

	public void setData(JSONObject data) {
		this.data = data;
	}
	
	public String toString() {
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("data", this.data);
		return jsonobj.toString();
	}
	
}
