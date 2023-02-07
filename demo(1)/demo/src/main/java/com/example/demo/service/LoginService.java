package com.example.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.demo.reqres.ResponsePayload;

@Service
public class LoginService {

	public LoginService() {};
	
	String DB_URL = "jdbc:mysql://localhost:3306/user";
	
	public void insertDetails() {
		//System.out.println("hello");
		ResponsePayload resPayload = new ResponsePayload();
		try {
			Connection conn;
			PreparedStatement ps;
			ResultSet rs;
			String Query = "select * from user";
			
			conn= DriverManager.getConnection(DB_URL,"root","Secur3d@lert");
			ps=conn.prepareStatement(Query);
			rs=ps.executeQuery();
			
			ArrayList<JSONObject> arr = new ArrayList<JSONObject>();
			//insert detail to DB 
			while(rs.next()) {
				JSONObject json = new JSONObject();
				json.put("userName", rs.getString("userName"));
				json.put("loginName", rs.getString("loginName"));
				json.put("password", rs.getString("password"));
				
				arr.add(json);
				System.out.println(arr);
				
			}
			conn.close();
			rs.close();
			ps.close();
	
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		return resPayload;
	}
}
