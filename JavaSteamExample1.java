package tns.SteamAPI;
import java.util.*;
class Product1{
	int id;
	String name;
	float price;
	
	public Product1(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class JavaSteamExample1 {

	public static void main(String[] args) {
		List<Product1> productList=new ArrayList<Product1>();
		productList.add(new Product1(1,"HP Laptop",25000f));
		productList.add(new Product1(2,"Lenovo Laptop",56000f));
		productList.add(new Product1(3,"Dell Laptop",20000f));
		productList.add(new Product1(4,"ASUS Laptop",52000f));
	
	List<Float>ProductPriceList=new ArrayList<Float>();
	for(Product1 product:productList) {
		if(product.price<30000) {
			ProductPriceList.add(product.price);
		}
	}
	System.out.println(ProductPriceList);
	}

}
