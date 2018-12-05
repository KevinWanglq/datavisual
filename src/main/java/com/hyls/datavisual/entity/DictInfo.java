package com.hyls.datavisual.entity;

public class DictInfo {
	private String pk ; 
	private String dictKey;
	private String dictValue;
	private String dictComment;
	private String tabCode;
	private String tabPk;
	private String colCode;
	private String colPk;
	private String module;
	private String modCode;
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getDictKey() {
		return dictKey;
	}
	public void setDictKey(String dictKey) {
		this.dictKey = dictKey;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public String getDictComment() {
		return dictComment;
	}
	public void setDictComment(String dictComment) {
		this.dictComment = dictComment;
	}
	public String getColCode() {
		return colCode;
	}
	public void setColCode(String colCode) {
		this.colCode = colCode;
	}
	public String getColPk() {
		return colPk;
	}
	public void setColPk(String colPk) {
		this.colPk = colPk;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getModCode() {
		return modCode;
	}
	public void setModCode(String modCode) {
		this.modCode = modCode;
	}
	public String getTabCode() {
		return tabCode;
	}
	public void setTabCode(String tabCode) {
		this.tabCode = tabCode;
	}
	public String getTabPk() {
		return tabPk;
	}
	public void setTabPk(String tabPk) {
		this.tabPk = tabPk;
	}
	
}
