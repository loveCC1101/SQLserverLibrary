package com.sdnu.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReader<M extends BaseReader<M>> extends Model<M> implements IBean {

	public void set借书证号(java.lang.String 借书证号) {
		set("借书证号", 借书证号);
	}

	public java.lang.String get借书证号() {
		return get("借书证号");
	}

	public void set密码(java.lang.String 密码) {
		set("密码", 密码);
	}

	public java.lang.String get密码() {
		return get("密码");
	}

	public void set姓名(java.lang.String 姓名) {
		set("姓名", 姓名);
	}

	public java.lang.String get姓名() {
		return get("姓名");
	}

	public void set性别(java.lang.Boolean 性别) {
		set("性别", 性别);
	}

	public java.lang.Boolean get性别() {
		return get("性别");
	}

	public void set出生日期(java.lang.String 出生日期) {
		set("出生日期", 出生日期);
	}

	public java.lang.String get出生日期() {
		return get("出生日期");
	}

	public void set专业(java.lang.String 专业) {
		set("专业", 专业);
	}

	public java.lang.String get专业() {
		return get("专业");
	}

	public void set借书量(java.lang.Integer 借书量) {
		set("借书量", 借书量);
	}

	public java.lang.Integer get借书量() {
		return get("借书量");
	}

	public void set联系方式(java.lang.String 联系方式) {
		set("联系方式", 联系方式);
	}

	public java.lang.String get联系方式() {
		return get("联系方式");
	}

}
