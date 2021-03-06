package com.newer.petstore.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 分类(名称)
 * @author Drui
 *
 */
public class Category {

	// 编号
	private int id;
	
	// 分类的名称
	private String title;
	
	// 该分类的所有商品
	private List<Product> productList = new LinkedList<>();
	
	
	public Category() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
}
