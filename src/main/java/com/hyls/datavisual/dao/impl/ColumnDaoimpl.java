package com.hyls.datavisual.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hyls.datavisual.dao.IColumnDao;
import com.hyls.datavisual.entity.ColumnInfo;
@Repository
public class ColumnDaoimpl implements IColumnDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int add(ColumnInfo column) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ColumnInfo column) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ColumnInfo findColumnById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ColumnInfo> findColumnByTabId(String id) {
		List<ColumnInfo> list = jdbcTemplate.query("select * from tb_column_info where tbpk=? order by order_no ", new Object[]{id}, new BeanPropertyRowMapper(ColumnInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<ColumnInfo> findColumnsByName(String name) {
		
		List<ColumnInfo> list = jdbcTemplate.query("select * from tb_column_info where col_name like ? order by order_no ", new Object[]{"%"+name+"%"}, new BeanPropertyRowMapper(ColumnInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<ColumnInfo> findColumnsByCode(String code) {
		List<ColumnInfo> list = jdbcTemplate.query("select * from tb_column_info where col_code like ? order by col_code ", new Object[]{"%"+code+"%"}, new BeanPropertyRowMapper(ColumnInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

}
