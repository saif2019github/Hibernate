package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderdetailsid;
	
	private String productname;
	
	private String quantity;
	
	private String price;
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private CustomerOrder orderid;

	public int getOrderdetailsid() {
		return orderdetailsid;
	}

	public void setOrderdetailsid(int orderdetailsid) {
		this.orderdetailsid = orderdetailsid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	public CustomerOrder getOrderid() {
		return orderid;
	}

	public void setOrderid(CustomerOrder orderid) {
		this.orderid = orderid;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderdetailsid=" + orderdetailsid + ", productname=" + productname + ", quantity="
				+ quantity + ", price=" + price + ", orderid=" + orderid + "]";
	}

	
}
