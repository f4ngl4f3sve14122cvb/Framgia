package com.framgia.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author toandk
 */
public class Shop implements java.io.Serializable {

	private int id;
	private String name;
	private String address;
	private String tel;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	private Set<User> users = new HashSet<User>(0);
	private Set<Product> products = new HashSet<Product>(0);

	public Shop() {
	}

	public Shop(int id) {
		this.id = id;
	}

	public Shop(int id, String name, String address, String tel, Set<OrderDetail> orderDetails, Set<User> users,
			Set<Product> products) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.orderDetails = orderDetails;
		this.users = users;
		this.products = products;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
