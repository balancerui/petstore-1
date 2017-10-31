package com.newer.petstore.domain;

import java.util.List;

/**
 * 分类(名称)
 * @author Drui
 *
 */
public class Category {

	// 编号
	int id;
	
	// 分类的名称
	String title;
	
	// 该分类的所有商品
	List<Product> productList;
	
	
}
