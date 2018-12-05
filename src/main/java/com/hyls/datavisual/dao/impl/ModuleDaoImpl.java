package com.hyls.datavisual.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hyls.datavisual.dao.IModuleDao;
import com.hyls.datavisual.dao.mapper.ModuleRowMapper;
import com.hyls.datavisual.dao.mapper.TableRowMapper;
import com.hyls.datavisual.entity.SysModule;
@Repository
public class ModuleDaoImpl implements IModuleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int add(SysModule module) {
		return 0;
	}

	@Override
	public int update(SysModule module) {
		return 0;
	}


	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public SysModule findModuleById(String id) {
		return jdbcTemplate.queryForObject("select * from tb_sysmodule where pk=?",  new Object[]{id}, new ModuleRowMapper());
	}

	@Override
	public List<SysModule> findModuleList() {
		List<SysModule> list = jdbcTemplate.query("select * from tb_sysmodule order by sysid", new Object[]{}, new BeanPropertyRowMapper(SysModule.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<SysModule> findModulesByName(String name) {
		List<SysModule> list = jdbcTemplate.query("select * from tb_sysmodule where module_name like ? order by sysid", new Object[]{"%"+name+"%"}, new BeanPropertyRowMapper(SysModule.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}

	@Override
	public List<SysModule> findModulesByCode(String code) {
		List<SysModule> list = jdbcTemplate.query("select * from tb_sysmodule where sysid like ? order by sysid", new Object[]{"%"+code+"%"}, new BeanPropertyRowMapper(SysModule.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}
	
}
