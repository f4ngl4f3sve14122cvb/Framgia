package com.framgia.model;

/**
 * @author toandk
 */
public class OrderDetail implements java.io.Serializable {

	private OrderDetailId id;
	private Order order;
	private Product product;
	private Shop shop;
	private Integer quantity;
	private Integer status;

	public OrderDetail() {
	}

	public OrderDetail(OrderDetailId id, Order order, Product product, Shop shop) {
		this.id = id;
		this.order = order;
		this.product = product;
		this.shop = shop;
	}

	public OrderDetail(OrderDetailId id, Order order, Product product, Shop shop, Integer quantity, Integer status) {
		this.id = id;
		this.order = order;
		this.product = product;
		this.shop = shop;
		this.quantity = quantity;
		this.status = status;
	}

	public OrderDetailId getId() {
		return this.id;
	}

	public void setId(OrderDetailId id) {
		this.id = id;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
