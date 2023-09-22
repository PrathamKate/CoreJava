package tns.SteamAPI;
import java.util.ArrayList;
import java.util.List;

class Product6{
	int id;
	String name;
	float price;
	
	public Product6(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}}
public class JavaSteamAPI6 {

	public static void main(String[] args) {
List<Product6> productList=new ArrayList<Product6>();
		
		productList.add(new Product6(1,"HP Laptop",25000f));
		productList.add(new Product6(2,"Lenovo Laptop",56000f));
		productList.add(new Product6(3,"Dell Laptop",20000f));
		productList.add(new Product6(4,"ASUS Laptop",52000f));
	
		long count=productList.stream().filter(product->product.price<30000).count();
		System.out.println(count);
	}

}
