package com.hyls.datavisual.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hyls.datavisual.entity.TableInfo;

public class TableRowMapper implements RowMapper<TableInfo>{

	@Override
	public TableInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		TableInfo table = new TableInfo();
		table.setPk(rs.getString("pk"));
		table.setSourceSyspk(rs.getString("source_syspk"));
		table.setTableName(rs.getString("table_name"));
		table.setTableCode(rs.getString("table_code"));
		table.setDistrict(rs.getString("district"));

		return table;
	}

}
