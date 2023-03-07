package com.pojo;

public class Shop {
	private int shop_id;
	private String shop_category;
	private String shop_name;
	private String customer_name;
	private String shop_status;
	private String shop_owner;
	private String lease_status;

	public Shop() {
		super();

	}

	public Shop(int shop_id, String shop_category, String shop_name, String customer_name, String shop_status,
			String shop_owner, String lease_status) {
		super();
		this.shop_id = shop_id;
		this.shop_category = shop_category;
		this.shop_name = shop_name;
		this.customer_name = customer_name;
		this.shop_status = shop_status;
		this.shop_owner = shop_owner;
		this.lease_status = lease_status;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public String getShop_category() {
		return shop_category;
	}

	public void setShop_category(String shop_category) {
		this.shop_category = shop_category;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getShop_status() {
		return shop_status;
	}

	public void setShop_status(String shop_status) {
		this.shop_status = shop_status;
	}

	public String getShop_owner() {
		return shop_owner;
	}

	public void setShop_owner(String shop_owner) {
		this.shop_owner = shop_owner;
	}

	public String getLease_status() {
		return lease_status;
	}

	public void setLease_status(String lease_status) {
		this.lease_status = lease_status;
	}

}
