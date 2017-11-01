package com.newer.petstore.domain;

import java.math.BigDecimal;

/**
 * ��Ʒ
 * @author Drui
 *
 */
public class Product extends BaseEntity{
	
	// ��Ʒ����
	private String title;
	
	// ��Ʒ�۸�(ʮ������ ���ȱȽϸ�)
	private BigDecimal price;
	
	// ������Ϣ
	private String info;
	
	// �������
	private int quantity;
	
	// ����
	private int salesNum;
	
	// ��ƷͼƬ��·��
	private String picPath;
	
	// ���(��ѡ��)
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
