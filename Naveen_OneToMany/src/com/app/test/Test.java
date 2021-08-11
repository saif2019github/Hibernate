package com.app.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.CustomerOrder;
import com.app.model.OrderDetails;
import com.app.model.User;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try(Session ses = HibernateUtil.getSf().openSession()) {
			
			tx = ses.beginTransaction();
			
			CustomerOrder customerOrder = new CustomerOrder();
			customerOrder.setPaymentoption("E-Transfer");
			customerOrder.setCustomerid("101");
			customerOrder.setPhonenumber("7058679992");
			customerOrder.setTotalamount("5000");
			customerOrder.setShippingaddressid("1520");
			customerOrder.setBillingaddressid("6666");
			
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setPrice("1000");
			orderDetails.setProductname("Amazon Card");
			orderDetails.setQuantity("20");
			orderDetails.setOrderid(customerOrder);
			
			OrderDetails orderDetails2 = new OrderDetails();
			orderDetails2.setPrice("2000");
			orderDetails2.setProductname("Domino's Card");
			orderDetails2.setQuantity("50");
			orderDetails2.setOrderid(customerOrder);
			
			OrderDetails orderDetails3 = new OrderDetails();
			orderDetails3.setPrice("3000");
			orderDetails3.setProductname("Mc Donal Card");
			orderDetails3.setQuantity("60");
			orderDetails3.setOrderid(customerOrder);
			
			List<OrderDetails> orderList = new ArrayList<OrderDetails>();
			orderList.add(orderDetails);
			orderList.add(orderDetails2);
			orderList.add(orderDetails3);
			
			customerOrder.getOrderDetails().addAll(orderList);
			
//			ses.save(orderDetails);
//			ses.save(orderDetails2);
//			ses.save(orderDetails3);
			ses.save(customerOrder);
			
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}
		
	}
}
