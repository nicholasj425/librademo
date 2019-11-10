package com.libra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libra.demo.pojo.DataDict;
import com.libra.demo.pojo.IMoocJSONResult;
import com.libra.demo.service.DataDictService;

@RestController
@RequestMapping("datadict")
public class DataDictController {
	@Autowired
	private DataDictService dataService;
	
	@RequestMapping("/queryDataList")
	public IMoocJSONResult queryUserList(String type) {
		DataDict dd = new DataDict();
		dd.setTypeName(type);
	
		List<DataDict> dataList = dataService.queryDictList(dd);
		
		return IMoocJSONResult.ok(dataList);
	}
}
