package com.hyls.datavisual.service;

import java.util.List;

import com.hyls.datavisual.entity.TableInfo;

public interface ITableService {
	int add(TableInfo module);

    int update(TableInfo module);

    int delete(String id);

    TableInfo findTableById(String id);
    
    List<TableInfo> findTableBySysId(String id);
    
    List<TableInfo> findTableByName(String name);
    
    List<TableInfo> findTableByCode(String code);
}
