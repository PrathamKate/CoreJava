package tns.SteamAPI;
import java.util.ArrayList;
import java.util.List;

class Product5{
	int id;
	String name;
	float price;
	
	public Product5(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}}
public class JavaSteamAPI5 {

	public static void main(String[] args) {
List<Product5> productList=new ArrayList<Product5>();
		
		productList.add(new Product5(1,"HP Laptop",25000f));
		productList.add(new Product5(2,"Lenovo Laptop",56000f));
		productList.add(new Product5(3,"Dell Laptop",20000f));
		productList.add(new Product5(4,"ASUS Laptop",52000f));
	
		Product5 productA=productList.stream().max((product1,product2)->product1.price>product2.price ?1:-1).get();
	System.out.println(productA.price);
	Product5 productB=productList.stream().min((product1,product2)->product1.price>product2.price ?1:-1).get();
	System.out.println(productB.price);
	}

}
