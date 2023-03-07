package com.dao;

import java.sql.SQLException;

import com.pojo.Shop;

public interface ShopController {

	boolean insert(Shop s) throws SQLException;

	boolean update(Shop s) throws SQLException;

	boolean delete() throws SQLException;

	void view() throws SQLException;

}
