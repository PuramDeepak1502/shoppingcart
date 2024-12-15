package com.order.shpcart;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderDashboard {
	
	public static void showConsole() {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		
		OrderBL orderBL=new OrderBL();
		ProductBL productBL=new ProductBL();
		
		do
		{
			System.out.println("M E N U");
			System.out.println("1: Place New Order");
			System.out.println("2: Search Order By Id");
			System.out.println("3: Generate Order Report");
			System.out.println("4: Exit");
			System.out.println("Accept a choice[1 2 3 4 ]");
			choice=sc.nextInt();
			switch(choice){
				case 1:
		            productBL.getAllProducts();
		            
					System.out.print("Order Id:");
					int orderId=sc.nextInt();
					System.out.print("Product Id: ");
					int productId=sc.nextInt();
					System.out.println("Customer Id:");
					int customerId=sc.nextInt();
					System.out.print("Unit Price");
					int unitPrice=sc.nextInt();
					System.out.print("Qty on hand:");
					int qtyOrdered=sc.nextInt();
					
					Order order=new Order();
					order.setOrderId(orderId);
					order.setProductId(productId);
					order.setCustomerId(customerId);
					order.setQtyOrdered(qtyOrdered);
					order.setUnitPrice(unitPrice);					
					order.setOrderDate(new java.util.Date());
					
					boolean isAdded=orderBL.placeOrder(order);
					
					if(isAdded)
						System.out.println("Order placed successfully");
					else
						System.out.println("Failed to place the order");
					
					break;
				case 2:					
					System.out.print("Order ID to be searched: ");
					orderId=sc.nextInt();
					 order=orderBL.searchById(orderId);
					if(order!=null)
						System.out.println(order);
					else
						System.out.println("No such order exist with id "+orderId);
					break;
				case 3:					
					ArrayList<Order> orderList=orderBL.getAllOrders();
					System.out.println("Order List:");
					for(Order o : orderList)
					{
						System.out.println(o.getOrderId()+"\t"+o.getCustomerId()+"\t"+o.getProductId()+"\t"+o.getOrderDate()
						+"\t"+o.getQtyOrdered()+"\t"+o.getUnitPrice()+"\t"+(o.getQtyOrdered()*o.getUnitPrice()));
						
					}
					break;
				case 4:
					System.out.println("About to exit");
					break;
				default:
					System.out.println("Invalid choice, please try again...");
			}
			
		}while(choice!=4);
		

	}

}
