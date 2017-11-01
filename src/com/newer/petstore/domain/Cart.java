package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * ���ﳵ
 * @author Drui
 *
 */
public class Cart {
	
	// ��ϵ�����ݿ������
	private int id;
	
	// �û��˺�
	private Account account;
	
	// ��Ʒ������,hashmap�зŵ����ݲ���˳���
	private HashMap<Product,Integer> map = new HashMap<>();
	
	// �ܽ��ʱ
	private BigDecimal total;
	
	/**
	 * ���ﳵ���ܽ��
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
