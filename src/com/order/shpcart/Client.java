package com.order.shpcart;

public class Client {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Login Password");
		String password=sc.next();
		int choice;
		if(password.equals("admin")) {
			do {
				System.out.println("M  E  N  U");
				System.out.println("1: Product Management");
				System.out.println("2:Customer Management");
				System.out.println("3:Order Management");
				System.out.println("4:Exit");
				System.out.println("Read any choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					ProductDashboard.showConsole();
					break;
				case 2:
					CustomerDashboard.showConsole();
					break;
				case 3:
					OrderDashboard.showConsole();
					break;
				case 4:
					System.out.println("About to exit");
					break;
				default:
					System.out.println("Invalid choice, try again...");
					break;
				}
			}while(choice!=4);
		}else {
			System.out.println("Invalid Password");
		}
	}
}
