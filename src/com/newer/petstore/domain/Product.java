package com.newer.petstore.domain;

import java.math.BigDecimal;

/**
 * 商品
 * @author Drui
 *
 */
public class Product extends BaseEntity{
	
	// 商品名称
	private String title;
	
	// 商品价格(十进制数 精度比较高)
	private BigDecimal price;
	
	// 描述信息
	private String info;
	
	// 库存数量
	private int quantity;
	
	// 销量
	private int salesNum;
	
	// 商品图片的路径
	private String picPath;
	
	// 类别(可选的)
	private Category category;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSalesNum() {
		return salesNum;
	}

	public void setSalesNum(int salesNum) {
		this.salesNum = salesNum;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
