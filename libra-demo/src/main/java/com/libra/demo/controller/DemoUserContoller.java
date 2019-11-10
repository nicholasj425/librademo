package com.libra.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libra.demo.pojo.IMoocJSONResult;
import com.libra.demo.pojo.User;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/demouser")
public class DemoUserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setUsername("Test3");
		u.setJobtitle("abd");
		u.setSex(1);
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setUsername("Test4");
		u.setJobtitle("abd");
		u.setSex(1);
		
		return IMoocJSONResult.ok(u);
	}
}
