package com.newer.petstore.domain;

import java.io.Serializable;

/**
 * ����ʵ����Ļ���
 * @author Drui
 *
 */
public abstract class BaseEntity implements Serializable{
	
	// ����
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
