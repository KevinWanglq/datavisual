package com.hyls.datavisual.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hyls.datavisual.entity.SysModule;

public class ModuleRowMapper  implements RowMapper<SysModule>{

	@Override
	public SysModule mapRow(ResultSet rs, int rowNum) throws SQLException {
		SysModule module = new SysModule();
		module.setPk(rs.getString("pk"));
		module.setModuleName(rs.getString("module_name"));
		module.setSysid(rs.getString("sysid"));
		return module;
	}

}
