package com.hyls.datavisual.dao;

import java.util.List;

import com.hyls.datavisual.entity.TableInfo;

public interface ITableDao {
	int add(TableInfo module);

    int update(TableInfo module);

    int delete(String id);

    TableInfo findTableById(String id);
    
    List<TableInfo> findTableBySysId(String id);
    
    List<TableInfo> findTableList();
    
    List<TableInfo> findTablesByName(String name);
    List<TableInfo> findTablesByCode(String code);
}
