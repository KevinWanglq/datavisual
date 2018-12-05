package com.hyls.datavisual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyls.datavisual.dao.IModuleDao;
import com.hyls.datavisual.entity.SysModule;
import com.hyls.datavisual.service.IModuleService;
@Service
public class ModuleServiceImpl implements IModuleService{
	@Autowired
	IModuleDao dao ;

	@Override
	public int add(SysModule module) {
		// TODO Auto-generated method stub
		return dao.add(module);
	}

	@Override
	public int update(SysModule module) {
		// TODO Auto-generated method stub
		return dao.update(module);
	}

	
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public SysModule findModuleById(String id) {
		// TODO Auto-generated method stub
		return dao.findModuleById(id);
	}

	@Override
	public List<SysModule> findModuleList() {
		// TODO Auto-generated method stub
		return dao.findModuleList();
	}

	@Override
	public List<SysModule> findModulesByName(String name) {
		// TODO Auto-generated method stub
		return dao.findModulesByName(name);
	}

	@Override
	public List<SysModule> findModulesByCode(String code) {
		// TODO Auto-generated method stub
		return dao.findModulesByCode(code);
	}

	
}
