
package com.pojo;

import java.util.Arrays;

public class Branch {

	String branch;
	Book b[];

	public Branch() {

	}

	public Branch(String branch, Book[] b) {
		super();
		this.branch = branch;
		this.b = b;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Book[] getB() {
		return b;
	}

	public void setB(Book[] b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Branch [branch=" + branch + ", b=" + Arrays.toString(b) + "]";
	}

}
