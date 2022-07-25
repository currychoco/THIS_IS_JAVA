package day1;

class Product{
	String name;
	int balance;
	int price;
	
	Product(){
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		
		Product[] products = {
				new Product(),
				new Product("사과", 20, 20000),
				new Product("바나나", 50, 16000),
				new Product("파인애플", 3, 12000),
				new Product("애플망고", 5, 50000)
		};
		
		for(Product p : products) {
			System.out.printf("상품이름 : %s, 재고량: %d, 가격: %,d\n", p.name, p.balance, p.price);
		}
	}
}
