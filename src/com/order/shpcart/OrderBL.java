package com.order.shpcart;
import java.util.ArrayList;

public class OrderBL {
		
	ArrayList<Order> orderList;
	
	public OrderBL() {
		orderList = new ArrayList<Order>();
	}
	
	public boolean placeOrder(Order order) {
		return orderList.add(order);
	}
	
	public Order searchById(int OrderId) {
		Order order=null;
		for(Order order1:orderList){
			if(order1.getOrderId()==OrderId)
				order=order1;
				break;
			}
		return order;
	}
	
	public ArrayList<Order> getAllOrders(){
		return orderList;
	}
}
