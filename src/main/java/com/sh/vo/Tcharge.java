package com.sh.vo;

public class Tcharge {
	
	private int id;
	private String charge_code;
	private String charge_name;
	private int charge;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharge_code() {
		return charge_code;
	}
	public void setCharge_code(String charge_code) {
		this.charge_code = charge_code;
	}
	public String getCharge_name() {
		return charge_name;
	}
	public void setCharge_name(String charge_name) {
		this.charge_name = charge_name;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "Tcharge [id=" + id + ", charge_code=" + charge_code + ", charge_name=" + charge_name + ", charge="
				+ charge + "]";
	}
	

}
