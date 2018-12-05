package com.hyls.datavisual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyls.datavisual.dao.ITableDao;
import com.hyls.datavisual.entity.TableInfo;
import com.hyls.datavisual.service.ITableService;

@Service
public class TableServiceImpl implements ITableService{
	@Autowired
	ITableDao dao ;

	@Override
	public int add(TableInfo table) {
		// TODO Auto-generated method stub
		return dao.add(table);
	}

	@Override
	public int update(TableInfo table) {
		// TODO Auto-generated method stub
		return dao.update(table);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public TableInfo findTableById(String id) {
		// TODO Auto-generated method stub
		return dao.findTableById(id);
	}

	@Override
	public List<TableInfo> findTableBySysId(String id) {
		// TODO Auto-generated method stub
		return dao.findTableBySysId(id);
	}

	@Override
	public List<TableInfo> findTableByName(String name) {
		// TODO Auto-generated method stub
		return dao.findTablesByName(name);
	}

	@Override
	public List<TableInfo> findTableByCode(String code) {
		// TODO Auto-generated method stub
		return dao.findTablesByCode(code);
	}
	
}
