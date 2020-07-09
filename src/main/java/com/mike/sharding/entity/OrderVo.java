package com.mike.sharding.entity;

public class OrderVo {

	private long orderId;
	 
	private int userId;
 
	private String status;
	
	private String userName;
	 
	private int age;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	 
		@Override
		public String toString() {
			return String.format("order_id: %s, user_id: %s, status: %s, userName: %s, age: %s", orderId, userId, status, userName, age);
		}
}
