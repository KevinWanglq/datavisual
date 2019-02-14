package com.hyls.datavisual.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyls.datavisual.dao.IImageDao;
import com.hyls.datavisual.entity.ImageInfo;
import com.hyls.datavisual.service.IImageService;
@Service
public class ImageServiceImpl implements IImageService {
	@Autowired
	IImageDao dao;
	@Override
	public int add(ImageInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ImageInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String pk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ImageInfo> findImageInfoByName(String name) {
		// TODO Auto-generated method stub
		return dao.findImageInfoByName(name);
	}

	@Override
	public List<ImageInfo> findImageInfoByCode(String code) {
		// TODO Auto-generated method stub
		return dao.findImageInfoByCode(code);
	}

}
