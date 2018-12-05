package com.hyls.datavisual.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hyls.datavisual.dao.IDictDao;
import com.hyls.datavisual.entity.ColumnInfo;
import com.hyls.datavisual.entity.DictInfo;
@Repository
public class DictDaoImpl implements IDictDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int add(DictInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DictInfo dictInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String pk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DictInfo> findDictsByColpk(String pk) {
		List<DictInfo> list = jdbcTemplate.query("select * from tb_dict where col_pk = ? order by dict_key ", new Object[]{pk}, new BeanPropertyRowMapper(DictInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<DictInfo> findDictsByColcode(String code) {
		List<DictInfo> list = jdbcTemplate.query("select * from tb_dict where col_code like ? order by dict_key ", new Object[]{"%"+code+"%"}, new BeanPropertyRowMapper(DictInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<DictInfo> findDictsByDictValue(String value) {
		List<DictInfo> list = jdbcTemplate.query("select * from tb_dict where dict_value like ? order by dict_key ", new Object[]{"%"+value+"%"}, new BeanPropertyRowMapper(DictInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

}
