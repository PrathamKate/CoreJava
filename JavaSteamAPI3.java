package tns.SteamAPI;

import java.util.ArrayList;
import java.util.List;


class Product3{
	int id;
	String name;
	float price;
	
	public Product3(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}}
public class JavaSteamAPI3 {

	public static void main(String[] args) {
		
			List<Product3> productList=new ArrayList<Product3>();
			
			productList.add(new Product3(1,"HP Laptop",25000f));
			productList.add(new Product3(2,"Lenovo Laptop",56000f));
			productList.add(new Product3(3,"Dell Laptop",20000f));
			productList.add(new Product3(4,"ASUS Laptop",52000f));
		
			productList.stream().filter(product->product.price==20000).forEach(product ->System.out.println(product.name));
	
	}}
