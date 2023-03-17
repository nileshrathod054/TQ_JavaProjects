package com.pojo;

public class Person {
	int p_id;
	String p_name;
	String p_dob;
	String p_adhar;
	String p_phno;
	String p_address;

	
	public Person() {
		super();

	}

	public Person(int p_id, String p_name, String p_dob, String p_adhar, String p_phno, String p_address) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_dob = p_dob;
		this.p_adhar = p_adhar;
		this.p_phno = p_phno;
		this.p_address = p_address;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_dob() {
		return p_dob;
	}

	public void setP_dob(String p_dob) {
		this.p_dob = p_dob;
	}

	public String getP_adhar() {
		return p_adhar;
	}

	public void setP_adhar(String p_adhar) {
		this.p_adhar = p_adhar;
	}

	public String getP_phno() {
		return p_phno;
	}

	public void setP_phno(String p_phno) {
		this.p_phno = p_phno;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

}
