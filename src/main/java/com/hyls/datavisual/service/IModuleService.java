package com.hyls.datavisual.service;

import java.util.List;

import com.hyls.datavisual.entity.SysModule;

public interface IModuleService {
	
    int add(SysModule module);

    int update(SysModule module);

    int delete(String id);

    SysModule findModuleById(String id);

    List<SysModule> findModuleList();
    
    List<SysModule> findModulesByName(String name);
    
    List<SysModule> findModulesByCode(String code);
}
