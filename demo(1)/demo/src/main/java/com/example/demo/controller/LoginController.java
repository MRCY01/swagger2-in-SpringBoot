package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reqres.RequestPayload;
import com.example.demo.service.LoginService;


@RestController
public class LoginController {
	
	@Autowired
	LoginService lgs = new LoginService();
	
	public LoginController(LoginService lgs) {	
		this.lgs = new LoginService();
	}
	
	@RequestMapping(path="/show",method = RequestMethod.POST)
	public void insertDetails(@RequestBody RequestPayload reqPayload) {
		lgs.insertDetails();
	}
	
}
