package com.hyls.datavisual.service;

import java.util.List;
import com.hyls.datavisual.entity.ImageInfo;

public interface IImageService {
	int add(ImageInfo dictInfo);

    int update(ImageInfo dictInfo);

    int delete(String pk);
    
    List<ImageInfo> findImageInfoByName(String name);
    
    List<ImageInfo> findImageInfoByCode(String code);
}
