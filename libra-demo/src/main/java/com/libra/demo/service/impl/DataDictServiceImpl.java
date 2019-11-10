package com.libra.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import com.libra.demo.mapper.DataDictMapper;
import com.libra.demo.pojo.DataDict;
import com.libra.demo.service.DataDictService;

import tk.mybatis.mapper.entity.Example;

@Service
public class DataDictServiceImpl implements DataDictService {
	@Autowired
	private DataDictMapper dataDictMapper;
	
	@Override
	public List<DataDict> queryDictList(DataDict dataDict){
		Example example = new Example(DataDict.class);
		Example.Criteria criteria = example.createCriteria();
		
		if (!StringUtils.isEmptyOrWhitespace(dataDict.getTypeName())) {
			criteria.andEqualTo("typeName", dataDict.getTypeName());
			
		}
		
		List<DataDict> ddList = dataDictMapper.selectByExample(example);
		
		return ddList;
	}
}
