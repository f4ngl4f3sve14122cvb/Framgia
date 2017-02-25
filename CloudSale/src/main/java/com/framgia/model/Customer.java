package com.framgia.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author toandk
 */
public class Customer implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date dob;
	private String address;
	private String tel;
	private String email;
	private Set<User> users = new HashSet<User>(0);
	private Set<Order> orders = new HashSet<Order>(0);

	public Customer() {
	}

	public Customer(String name, Date dob, String address, String tel, String email, Set<User> users,
			Set<Order> orders) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.users = users;
		this.orders = orders;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
