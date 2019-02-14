package com.hyls.datavisual.dao;

import java.util.List;

import com.hyls.datavisual.entity.ImageInfo;

public interface IImageDao {
	int add(ImageInfo dictInfo);

    int update(ImageInfo dictInfo);

    int delete(String pk);
    
    List<ImageInfo> findImageInfoByName(String name);
    
    List<ImageInfo> findImageInfoByCode(String code);
}
