package com.hyls.datavisual.service;

import java.util.List;

import com.hyls.datavisual.entity.ColumnInfo;

public interface IColumnService {
	int add(ColumnInfo module);

    int update(ColumnInfo module);

    int delete(String id);

    ColumnInfo findColumnById(String id);
    
    List<ColumnInfo> findColumnByTabId(String id);
    List<ColumnInfo> findColumnsByName(String name);
    List<ColumnInfo> findColumnsByCode(String code);
}
