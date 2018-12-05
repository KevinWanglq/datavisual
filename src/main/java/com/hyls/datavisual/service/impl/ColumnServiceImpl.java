package com.hyls.datavisual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyls.datavisual.dao.IColumnDao;
import com.hyls.datavisual.entity.ColumnInfo;
import com.hyls.datavisual.service.IColumnService;
@Service
public class ColumnServiceImpl implements IColumnService {
	
	@Autowired
	IColumnDao dao;
	@Override
	public int add(ColumnInfo column) {
		// TODO Auto-generated method stub
		return dao.add(column);
	}

	@Override
	public int update(ColumnInfo column) {
		// TODO Auto-generated method stub
		return dao.update(column);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public ColumnInfo findColumnById(String id) {
		// TODO Auto-generated method stub
		return dao.findColumnById(id);
	}

	@Override
	public List<ColumnInfo> findColumnByTabId(String id) {
		// TODO Auto-generated method stub
		return dao.findColumnByTabId(id);
	}

	@Override
	public List<ColumnInfo> findColumnsByName(String name) {
		// TODO Auto-generated method stub
		return dao.findColumnsByName(name);
	}

	@Override
	public List<ColumnInfo> findColumnsByCode(String code) {
		// TODO Auto-generated method stub
		return dao.findColumnsByCode(code);
	}

}
