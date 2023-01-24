package com.pojo;

public class Book {

	private int id;
	private String name;
	private int price;
	private int no_of_copies;
	
	public Book() {
		super();
	}

	public Book(int id, String name, int price, int no_of_copies) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.no_of_copies = no_of_copies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", no_of_copies=" + no_of_copies + "]";
	}
	
	

}
