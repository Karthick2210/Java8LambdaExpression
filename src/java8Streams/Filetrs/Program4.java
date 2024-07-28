package java8Streams.Filetrs;

import java.util.ArrayList;

class Product {
	 
	 int price;
	 String Name;
	 String Brand;
	public Product(int price, String name, String brand) {
		this.price = price;
		Name = name;
		Brand = brand;
	}
	

public class Program4 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> arrayList = new ArrayList<Product>();
		
		arrayList.add(new Product(24560,"sonyBravia","SONY"));
		arrayList.add(new Product(246760,"MotoG18","Moto"));
		arrayList.add(new Product(26560,"MotoG17","MOTO"));
		arrayList.add(new Product(24560,"MotoG15","Moto"));
		arrayList.add(new Product(27560,"Nokia12B","Moto"));
		
		arrayList.stream()
		.filter(prod->prod.price>20000)
		.forEach(pr->System.out.println(pr.Name));
		
		
	}
}
	 
	 

}
