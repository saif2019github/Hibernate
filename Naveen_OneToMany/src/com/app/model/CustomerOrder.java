package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderid;
	
	private String customerid;
	
	private String totalamount;
	
	private String paymentoption;
	
	private String shippingaddressid;

	private String billingaddressid;
	
	private String phonenumber;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="orderid")
	private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public String getPaymentoption() {
		return paymentoption;
	}

	public void setPaymentoption(String paymentoption) {
		this.paymentoption = paymentoption;
	}

	public String getShippingaddressid() {
		return shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	public String getBillingaddressid() {
		return billingaddressid;
	}

	public void setBillingaddressid(String billingaddressid) {
		this.billingaddressid = billingaddressid;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "CustomerOrder [orderid=" + orderid + ", customerid=" + customerid + ", totalamount=" + totalamount
				+ ", paymentoption=" + paymentoption + ", shippingaddressid=" + shippingaddressid
				+ ", billingaddressid=" + billingaddressid + ", phonenumber=" + phonenumber + ", orderDetails="
				+ orderDetails + "]";
	}

}
