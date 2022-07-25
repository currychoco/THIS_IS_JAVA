package day1;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "이것이 자바다";
		author = "신용권";
		price = 27000;
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookrInfo(){
		return "책이름: " + title + ", 저자: " + author + ", 가격: " + price;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1= new Book();
		Book b2= new Book("자바의 정석", "남궁성", 22500);
		Book b3= new Book("매일을 헤엄치는 법", "이연", 14400);
		Book b4= new Book("역행자", "자청", 15750);
		Book b5= new Book("어른의 시간", "줄리스리스콧헤임스", 18000);
		
		System.out.println(b1.getBookrInfo()); 
		System.out.println(b2.getBookrInfo()); 
		System.out.println(b3.getBookrInfo()); 
		System.out.println(b4.getBookrInfo()); 
		System.out.println(b5.getBookrInfo()); 
	}
}
