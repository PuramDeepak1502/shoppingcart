package com.order.shpcart;
import java.util.*;

public class ProductDashboard {

	public static void showConsole() {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		
		ProductBL productBL=new ProductBL();
		
		do
		{
			System.out.println("M E N U");
			System.out.println("1: Add Product");
			System.out.println("2: Search Product By Id");
			System.out.println("3: Search Product By Category");
			System.out.println("4: Remove an existing Product");
			System.out.println("5: Update the Product");
			System.out.println("6: Display all product");
			System.out.println("7: Exit");
			System.out.println("Accept a choice[1 2 3 4 5 6 7]");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Product Id:");
					int productId=sc.nextInt();
					System.out.print("Product Name:");
					String productName=sc.next();
					System.out.print("Unit Price");
					double unitPrice=sc.nextDouble();
					System.out.print("Qty on hand:");
					int qtyOnHand=sc.nextInt();
					System.out.print("Category:");
					String category=sc.next();
					System.out.print("Description:");
					String description=sc.next();
					
					Product product=new Product();
					product.setProductId(productId);
					product.setProductName(productName);
					product.setUnitPrice(unitPrice);
					product.setQtyOnHand(qtyOnHand);
					product.setCategory(category);
					product.setDescription(description);
					
					boolean isAdded=productBL.addProduct(product);
					
					if(isAdded)
						System.out.println("Product added successfully");
					else
						System.out.println("Failed to add the product");
					
					break;
				case 2:					
					System.out.print("Product ID to be searched: ");
					productId=sc.nextInt();
					product=productBL.searchById(productId);
					if(product!=null)
						System.out.println(product);
					else
						System.out.println("No such product exist with id "+productId);
					break;
				case 3:
					System.out.print("Product category to be searched: ");
					category=sc.next();
					ArrayList<Product> productList=productBL.searchByCategory(category);
					System.out.println("Product belong to categoery: "+ category);
					for(Product p : productList)
					{
						System.out.println(p);
					}
					break;
				case 4:
					System.out.println("Read the product id to be removed: ");
					productId=sc.nextInt();
					boolean isRemoved=productBL.removeProduct(productId);
					if(isRemoved)
						System.out.println("Product removed successfully");
					else
						System.out.println("No such product with product id: "+productId);
					break;
				case 5:
					System.out.println("Read the product id to be updated:");
					productId=sc.nextInt();
					System.out.println("Read the unit price to be updated:");
					unitPrice=sc.nextInt();
					System.out.println("Read the qtyonhand to be updated");
					qtyOnHand=sc.nextInt();
					productBL.updateProduct(productId, qtyOnHand, qtyOnHand);					
					break;
				case 6:					
					productList=productBL.getAllProducts();
					System.out.println("Product List:");
					for(Product p : productList)
					{
						System.out.println(p);
					}
					break;
				case 7:
					System.out.println("About to exit");
					break;
				default:
					System.out.println("Invalid choice, please try again...");
			}
			
		}while(choice!=7);
		

	}

}
