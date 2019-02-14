package com.hyls.datavisual.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hyls.datavisual.dao.ITableDao;
import com.hyls.datavisual.dao.mapper.TableRowMapper;
import com.hyls.datavisual.entity.TableInfo;
@Repository
public class TableDaoImpl implements ITableDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int add(TableInfo module) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TableInfo module) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TableInfo findTableById(String id) {
		return jdbcTemplate.queryForObject("select t1.*,t2.sysid from tb_info t1 left join tb_sysmodule t2 on t1.source_syspk = t2.pk where t1.pk=?",  new Object[]{id}, new TableRowMapper());
	}

	@Override
	public List<TableInfo> findTableBySysId(String id) {
		List<TableInfo> list = jdbcTemplate.query("select * from tb_info where source_syspk=? order by table_code ", new Object[]{id}, new BeanPropertyRowMapper(TableInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<TableInfo> findTableList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TableInfo> findTablesByName(String name) {
		List<TableInfo> list = jdbcTemplate.query("select t1.*,t2.sysid from tb_info t1 left join tb_sysmodule t2 on t1.source_syspk = t2.pk where t1.table_name like ? order by t1.table_code", new Object[]{"%"+name+"%"}, new BeanPropertyRowMapper(TableInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<TableInfo> findTablesByCode(String code) {
		List<TableInfo> list = jdbcTemplate.query("select t1.*,t2.sysid from tb_info t1 left join tb_sysmodule t2 on t1.source_syspk = t2.pk where t1.table_code like ? order by t1.table_code", new Object[]{"%"+code+"%"}, new BeanPropertyRowMapper(TableInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

}
