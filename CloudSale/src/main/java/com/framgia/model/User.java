package com.framgia.model;

/**
 * @author toandk
 */
public class User implements java.io.Serializable {

	private int identity;
	private Customer customer;
	private Shop shop;
	private String username;
	private String password;
	private Integer role;
	private Integer status;

	public User() {
	}

	public User(int identity, Customer customer, Shop shop) {
		this.identity = identity;
		this.customer = customer;
		this.shop = shop;
	}

	public User(int identity, Customer customer, Shop shop, String username, String password, Integer role,
			Integer status) {
		this.identity = identity;
		this.customer = customer;
		this.shop = shop;
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = status;
	}

	public int getIdentity() {
		return this.identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
