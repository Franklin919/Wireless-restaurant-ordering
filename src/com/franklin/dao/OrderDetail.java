package com.franklin.dao;

public class OrderDetail {
	private int id;
	private int orderId;
	private String foodName;
	private double foodPrice;
	private int foodCount;
	public int getId() {
		return id;
	}
	public OrderDetail(int id, int orderId, String foodName, double foodPrice, int foodCount) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodCount = foodCount;
	}
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getFoodCount() {
		return foodCount;
	}
	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", foodName=" + foodName + ", foodPrice=" + foodPrice
				+ ", foodCount=" + foodCount + "]";
	}
}
