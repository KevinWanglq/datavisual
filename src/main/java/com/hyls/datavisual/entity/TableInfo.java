package com.hyls.datavisual.entity;

public class TableInfo {
	private String pk;
	private String sourceSyspk;
	private String tableName;
	private String tableCode;
	private String district;
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getSourceSyspk() {
		return sourceSyspk;
	}
	public void setSourceSyspk(String sourceSyspk) {
		this.sourceSyspk = sourceSyspk;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableCode() {
		return tableCode;
	}
	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
}
