package com.hyls.datavisual.dao;

import java.util.List;

import com.hyls.datavisual.entity.ColumnInfo;

public interface IColumnDao {
	int add(ColumnInfo column);

    int update(ColumnInfo column);

    int delete(String id);

    ColumnInfo findColumnById(String id);
    
    List<ColumnInfo> findColumnByTabId(String id);
    
    List<ColumnInfo> findColumnsByName(String name);
    List<ColumnInfo> findColumnsByCode(String code);
    
}
