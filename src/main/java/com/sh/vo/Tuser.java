package com.sh.vo;

public class Tuser {
	
	private  int user_id;
	private int mobile_number;
	private String roaming_status;
	private String com_level;
	private int customer_id;
	private String is_available;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getRoaming_status() {
		return roaming_status;
	}
	public void setRoaming_status(String roaming_status) {
		this.roaming_status = roaming_status;
	}
	public String getCom_level() {
		return com_level;
	}
	public void setCom_level(String com_level) {
		this.com_level = com_level;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getIs_available() {
		return is_available;
	}
	public void setIs_available(String is_available) {
		this.is_available = is_available;
	}
	@Override
	public String toString() {
		return "Tuser [user_id=" + user_id + ", mobile_number=" + mobile_number + ", roaming_status=" + roaming_status
				+ ", com_level=" + com_level + ", customer_id=" + customer_id + ", is_available=" + is_available + "]";
	}
	

}
