package com.newer.petstore.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * �˺�
 * @author Drui
 *
 */
public class Account {
	
	// ������Ϣ
	private int id;
	private String name;
	private String password;
	private Address address;
	
	// ���ﳵ
	Cart cart;
	
	// ����
	List<Order> orderList = new LinkedList<>();
	
	public Account() {
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


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}



	/**
	 * �˺ŵĵ�ַ(�ھ۵�һ������)
	 * @author Drui
	 *
	 */
	public static class Address {
		
		// ��ַ�Ļ�����Ϣ
		String province;
		String city;
		String street;
		String name;
		String phone;
		
		public Address() {
			// TODO Auto-generated constructor stub
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	}
	

}
