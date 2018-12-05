package com.hyls.datavisual.service;

import java.util.List;

import com.hyls.datavisual.entity.DictInfo;


public interface IDictService {
	int add(DictInfo dictInfo);

    int update(DictInfo dictInfo);

    int delete(String pk);
    
    List<DictInfo> findDictsByColpk(String pk);
    
    List<DictInfo> findDictsByColcode(String code);
    
    List<DictInfo> findDictsByDictValue(String value);
}
