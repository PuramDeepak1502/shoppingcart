package com.order.shpcart;
import java.util.*;

public class ProductBL {
	
	ArrayList<Product> productList;
	
	ProductBL(){
		productList=new ArrayList<Product>();
	}
		
	public boolean addProduct(Product product){	
		
		boolean isAdded=productList.add(product);
		return isAdded;
		
	}
	
	public Product searchById(int productId){
		Product prod=null;
		for(Product product:productList){
			if(product.getProductId()==productId) {
				prod=product;
				break;
			}
		}
		return prod;
	}
	
	public ArrayList<Product> searchByCategory(String category){
		
		ArrayList<Product> productListByCategory=new ArrayList<Product>();
		
		for(Product product : productList) {
			if(product.getCategory().equals(category)){
				productListByCategory.add(product);
			}			
		}
		return productListByCategory;		
	}
	
	public boolean removeProduct(int productId){
		boolean isRemoved=false;
		for(Product product : productList) {
			if(product.getProductId()==productId) {
				return productList.remove(product);
			}
		}
		return isRemoved;
	}
		
	public void updateProduct(int productId,int qtyOnHand,int unitPrice){
		Product product;
		for(int i=0;i<productList.size();i++) {			
			if(productList.get(i).getProductId()==productId) {
				product=productList.get(i);
				product.setQtyOnHand(qtyOnHand);
				product.setUnitPrice(unitPrice);
				productList.set(i, product);
				System.out.println("Product updated successfully");
			}
		}
	}
	
	public ArrayList<Product> getAllProducts(){
		return productList;
	}

}
