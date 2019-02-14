package com.hyls.datavisual.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hyls.datavisual.dao.IImageDao;
import com.hyls.datavisual.entity.ImageInfo;
@Repository
public class ImageDaoImpl implements IImageDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
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
		List<ImageInfo> list = jdbcTemplate.query("select * from imageinfo where name like ? order by name", new Object[]{"%"+name+"%"}, new BeanPropertyRowMapper(ImageInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<ImageInfo> findImageInfoByCode(String code) {
		List<ImageInfo> list = jdbcTemplate.query("select * from imageinfo where staff_no like ? order by name", new Object[]{"%"+code+"%"}, new BeanPropertyRowMapper(ImageInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

}
