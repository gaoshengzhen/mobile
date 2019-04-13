package com.sh.vo;




public class Tcustomer {
	
	public Tcustomer() {
		super();
	}
	private int customer_id;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	private String id_type;
	private String id_number;
	private String customer_name;
	
	private String customer_birthday;
	private String customer_sex;
	private String customer_address;
	
	public Tcustomer(String string, String string2, Object object, Object object2, Object object3, Object object4) {
		// TODO Auto-generated constructor stub
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_birthday() {
		return customer_birthday;
	}
	public void setCustomer_birthday(String customer_birthday) {
		this.customer_birthday = customer_birthday;
	}
	public String getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(String customer_sex) {
		this.customer_sex = customer_sex;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	@Override
	public String toString() {
		return "Tcustomer [customer_id=" + customer_id + ", id_type=" + id_type + ", id_number=" + id_number
				+ ", customer_name=" + customer_name + ", customer_birthday=" + customer_birthday + ", customer_sex="
				+ customer_sex + ", customer_address=" + customer_address + "]";
	}
	

}
