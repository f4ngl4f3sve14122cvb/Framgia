package com.framgia.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author toandk
 */
public class Order implements java.io.Serializable {

	private Integer id;
	private Customer customer;
	private Double totalmoney;
	private Date date;
	private Integer status;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Order() {
	}

	public Order(Customer customer) {
		this.customer = customer;
	}

	public Order(Customer customer, Double totalmoney, Date date, Integer status, Set<OrderDetail> orderDetails) {
		this.customer = customer;
		this.totalmoney = totalmoney;
		this.date = date;
		this.status = status;
		this.orderDetails = orderDetails;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getTotalmoney() {
		return this.totalmoney;
	}

	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
