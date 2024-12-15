package com.order.shpcart;
import java.util.ArrayList;

public class CustomerBL {
	
	ArrayList<Customer> customerList;
	
	CustomerBL(){
		customerList=new ArrayList<Customer>();
	}
	
	public boolean addCustomer(Customer customer) {
		return customerList.add(customer);		
	}
	
	public boolean removeCustomer(int customerId) {
		boolean isRemoved=false;
		for(Customer customer : customerList) {
			if(customer.getCustomerId()==customerId) {
				return customerList.remove(customer);
			}
		}
		return isRemoved;
	}
	
	public void updateEmailId(int customerId, String emailId) {
		Customer cust;
		for(int i=0;i<customerList.size();i++) {			
			if(customerList.get(i).getCustomerId()==customerId) {
				cust=customerList.get(i);
				cust.setEmailId(emailId);
				customerList.set(i, cust);
				System.out.println("EmailId updated successfully");
			}
		}
	}
	
	public void updateMobileNo(int customerId,String mobileNo) {
		Customer cust;
		for(int i=0;i<customerList.size();i++) {			
			if(customerList.get(i).getCustomerId()==customerId) {
				cust=customerList.get(i);
				cust.setMobileNo(mobileNo);
				customerList.set(i, cust);
				System.out.println("MobileNo updated successfully");
			}
		}	
	}
	
	public ArrayList<Customer> getAllCustomers() {
		return customerList;
	}
}
