/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.data 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 下午5:52:26 
 */
package com.fcmmmmmm.data;

/**
 * @author FCmmmmmm
 *
 */
public class Respository {
	private String id;
	private String dec;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the dec
	 */
	public String getDec() {
		return dec;
	}
	/**
	 * @param dec the dec to set
	 */
	public void setDec(String dec) {
		this.dec = dec;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Respository [id=" + id + ", dec=" + dec + "]";
	}
	
}
