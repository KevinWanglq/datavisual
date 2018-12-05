package com.hyls.datavisual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyls.datavisual.dao.IDictDao;
import com.hyls.datavisual.entity.DictInfo;
import com.hyls.datavisual.service.IDictService;
@Service
public class DictServiceImpl implements IDictService{
	@Autowired
	IDictDao dao;
	@Override
	public int add(DictInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DictInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String pk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DictInfo> findDictsByColpk(String pk) {
		// TODO Auto-generated method stub
		return dao.findDictsByColpk(pk);
	}

	@Override
	public List<DictInfo> findDictsByColcode(String code) {
		// TODO Auto-generated method stub
		return dao.findDictsByColcode(code);
	}

	@Override
	public List<DictInfo> findDictsByDictValue(String value) {
		// TODO Auto-generated method stub
		return dao.findDictsByDictValue(value);
	}

}
