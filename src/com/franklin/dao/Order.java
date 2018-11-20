package com.franklin.dao;

import java.util.Date;

public class Order {
	private int id;
	private Date orderTime;
	private int tableNo;
	private int payStatus;
	private Date payTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + ", tableNo=" + tableNo + ", payStatus=" + payStatus
				+ ", payTime=" + payTime + "]";
	}
	
	public Order(int id, Date orderTime, int tableNo, int payStatus, Date payTime) {
		super();
		this.id = id;
		this.orderTime = orderTime;
		this.tableNo = tableNo;
		this.payStatus = payStatus;
		this.payTime = payTime;
	}
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	
}
