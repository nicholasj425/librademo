package com.libra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libra.demo.pojo.DataDict;
import com.libra.demo.pojo.User;
import com.libra.demo.service.DataDictService;
import com.libra.demo.service.UserService;



@Controller
@RequestMapping("th")
public class ThymeleafController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private DataDictService dataDictService;
	
	@RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "thymeleaf-libra");
        return "thymeleaf/index";
    }
	
	@RequestMapping("center")
    public String center() {
        return "thymeleaf/center/center";
    }
	
	@RequestMapping("test")
    public String test(ModelMap map) {
		
		User user = new User();
		user.setStatus("0");
		List<User> userList = userService.queryUserList(user);
		map.addAttribute("userList", userList);
		
		DataDict ddSex = new DataDict();
		ddSex.setTypeName("sex");
		List<DataDict> sexList = dataDictService.queryDictList(ddSex);
		map.addAttribute("sexList", sexList);
		
		
		DataDict ddTitle = new DataDict();
		ddTitle.setTypeName("jobtitle");
		List<DataDict> titleList = dataDictService.queryDictList(ddTitle);
		map.addAttribute("titleList", titleList);
		
        return "thymeleaf/test";
    }
}