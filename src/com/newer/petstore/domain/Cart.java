package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 购物车
 * @author Drui
 *
 */
public class Cart {
	
	// 关系型数据库的主键
	private int id;
	
	// 用户账号
	private Account account;
	
	// 商品、数量,hashmap中放的数据不是顺序的
	private HashMap<Product,Integer> map = new HashMap<>();
	
	// 总金额时
	private BigDecimal total;
	
	/**
	 * 购物车的总金额
	 * @return
	 */
	public BigDecimal getTotal() {
		
		Set<Product> keys = map.keySet();
		
		for (Product p : keys) {
			int n = map.get(p);
			total = total.add(
					p.getPrice().multiply(BigDecimal.valueOf(n)));
			
		}
		return total;
	}
	
	
//	private ArrayList<Product> cart = new ArrayList<Product>();
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}



	public HashMap<Product, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}
	

}
