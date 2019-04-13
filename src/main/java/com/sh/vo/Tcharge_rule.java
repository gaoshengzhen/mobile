package com.sh.vo;

public class Tcharge_rule {
	private String func_id;
	private String charge_code;
	private String func_name;
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public String getCharge_code() {
		return charge_code;
	}
	public void setCharge_code(String charge_code) {
		this.charge_code = charge_code;
	}
	public String getFunc_name() {
		return func_name;
	}
	public void setFunc_name(String func_name) {
		this.func_name = func_name;
	}
	@Override
	public String toString() {
		return "Tcharge_rule [func_id=" + func_id + ", charge_code=" + charge_code + ", func_name=" + func_name + "]";
	}
	

}
