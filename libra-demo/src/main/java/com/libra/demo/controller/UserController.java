package com.libra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libra.demo.pojo.IMoocJSONResult;
import com.libra.demo.pojo.User;
import com.libra.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveUser")
	public IMoocJSONResult saveUser() throws Exception {
	
		
		User user = new User();
		user.setUsername("Test6");
		user.setJobtitle("abd");
		user.setSex(1);
		
		userService.saveUser(user);
		
		return IMoocJSONResult.ok("Save Successfully");
	}
	
	@RequestMapping("/updateUser")
	public IMoocJSONResult updateUser() {
		
		User user = new User();
		user.setId(3);
		user.setWeight("60");
		userService.updateUser(user);
		return IMoocJSONResult.ok("Update Successfully");
	}	
	
	@RequestMapping("/deleteUser")
	public IMoocJSONResult deleteUser(Integer userId) {
		
		userService.deleteUser(userId);
		
		return IMoocJSONResult.ok("Delete Successfully");
	}
	
	@RequestMapping("/queryUserById")
	public IMoocJSONResult queryUserById(Integer userId) {
		
		return IMoocJSONResult.ok(userService.queryUserById(userId));
	}
	
	@RequestMapping("/queryUserList")
	public IMoocJSONResult queryUserList() {
		
		User user = new User();
		user.setStatus("0");
		
		List<User> userList = userService.queryUserList(user);
		
		return IMoocJSONResult.ok(userList);
	}
}
