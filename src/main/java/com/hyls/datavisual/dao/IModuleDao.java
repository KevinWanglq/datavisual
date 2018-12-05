package com.hyls.datavisual.dao;

import java.util.List;

import com.hyls.datavisual.entity.SysModule;

public interface IModuleDao {
    int add(SysModule module);

    int update(SysModule module);

    int delete(String id);

    SysModule findModuleById(String id);

    List<SysModule> findModuleList();
    
    List<SysModule> findModulesByName(String name);
    
    List<SysModule> findModulesByCode(String code);
}
