package com.dao;

import java.sql.SQLException;

import com.pojo.Person;

public interface PersonRecord {

	 boolean insert(Person p) throws SQLException;

	 void display() throws SQLException;

}
