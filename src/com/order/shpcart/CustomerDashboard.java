package com.order.shpcart;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDashboard {

	public static void showConsole() {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		
		CustomerBL customerBL=new CustomerBL();
		
		do
		{
			System.out.println("M E N U");
			System.out.println("1: Add Customer");
			System.out.println("2: Remove an existing Customer");
			System.out.println("3: Update Customer EmailID");
			System.out.println("4: Update Customer MobileNo");
			System.out.println("5: Display all customers");
			System.out.println("6: Exit");
			System.out.println("Accept a choice[1 2 3 4 5 6]");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Customer Id:");
					int customerId=sc.nextInt();
					System.out.print("Customer Name:");
					String customerName=sc.next();
					System.out.print("Email ID: ");
					String emailId=sc.next();
					System.out.print("Mobile No:");
					String mobileNo=sc.next();
					System.out.print("City :");
					String city=sc.next();
					
					Customer customer=new Customer();
					customer.setCustomerId(customerId);
					customer.setCustomerName(customerName);
					customer.setEmailId(emailId);
					customer.setMobileNo(mobileNo);
					customer.setCity(city);
					
					boolean isAdded=customerBL.addCustomer(customer);
					
					if(isAdded)
						System.out.println("Customer added successfully");
					else
						System.out.println("Failed to add the customer");
					
					break;
				case 2:
					System.out.println("Read the customer id to be removed");
					customerId=sc.nextInt();
					boolean isRemoved = customerBL.removeCustomer(customerId);
					if(isRemoved)
						System.out.println("Customer removed successfully");
					else
						System.out.println("Failed to remove the customer");
					break;
				case 3:
					System.out.println("Read the CustomerID");
					customerId=sc.nextInt();
					System.out.println("Read the EmailId: ");
					emailId=sc.next();
					customerBL.updateEmailId(customerId, emailId);					
					break;
				case 4:
					System.out.println("Read the CustomerID");
					customerId=sc.nextInt();
					System.out.println("Read the mobileNo: ");
					mobileNo=sc.next();
					customerBL.updateMobileNo(customerId, mobileNo);					
					break;
				case 5:					
					ArrayList<Customer> customerList=customerBL.getAllCustomers();
					System.out.println("Customer List:");
					for(Customer c : customerList)
					{
						System.out.println(c);
					}
					break;
				case 6:
					System.out.println("About to exit");
					break;
				default:
					System.out.println("Invalid choice, please try again...");
			}
			
		}while(choice!=6);
		

	}

}
