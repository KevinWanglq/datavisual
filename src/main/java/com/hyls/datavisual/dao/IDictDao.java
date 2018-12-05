package com.hyls.datavisual.dao;

import java.util.List;

import com.hyls.datavisual.entity.DictInfo;

public interface IDictDao {
	int add(DictInfo dictInfo);

    int update(DictInfo dictInfo);

    int delete(String pk);

    List<DictInfo> findDictsByColpk(String pk);
    
    List<DictInfo> findDictsByColcode(String code);
    
    List<DictInfo> findDictsByDictValue(String value);
}
