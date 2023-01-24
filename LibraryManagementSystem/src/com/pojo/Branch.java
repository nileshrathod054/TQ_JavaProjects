package com.pojo;

import java.util.Arrays;

public class Branch {

	private String branch;
	private Book books[];
	
	public Branch() {
		super();
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Branch(String branch, Book[] books) {
		super();
		this.branch = branch;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Branch [branch=" + branch + ", books=" + Arrays.toString(books) + "]";
	}
	
	
}
