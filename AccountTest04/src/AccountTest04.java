/*
 <멤버의 구분>
 1. 멤버 변수의 구분
 static이 있는 멤버변수 - 클래스 변수, static field(정적 필드)
 static이 없는 멤버변수 - 인스턴스 변수, non-static field(비정적 필드)
 
 인스턴스 변수, 비정적 필드 - 인스턴스를 생성할 때마다 만들어지는 변수
 클래스 변수, 정적 필드 - 해당 클래스를 사용하는 시점에 딱 1개만 만들어져서, 모든 인스턴스에서 공유하는 변수
 
 2. 멤버 메소드의 구분
 static이 있는 메소드 - 클래스 메소드, static method(정적 메소드)
 static이 없는 메소드 - 인스턴스 메소드, non-static method(비정적 메소드)
 
 인스턴스 메소드, 비정적 메소드 - 인스턴스를 생성할 때마다 만들어지는 메소드
 클래스 메소드, 정적 메소드 - 해당 클래스를 사용하는 시점에 딱 1개만 만들어져서, 모든 인스턴스에서 공유하는 메소드
 
*/


//문제1) 은행계좌의 인스턴스를 만들 때 각 인스턴스의 생성 일련번호를 멤버변수로 추가하여 사용하시오
//일련번호는 1부터 1씩 자동으로 증가하도록 설정, 일련번호명: id
class Account{
	//멤버 변수
	private static int count = 0; //클래스 변수
	private int id = 0; //인스턴스 변수
	private String name;
	private String no;
	private int balance;
	
	Account(){
		++count;
		id = count;
	}
	//생성자 오버로딩
	Account(String name, String no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
		++count;
		id = count;
	}
	
	//클래스 메소드
	public static int getCount() {
		return count;
	}
	
	//인스턴스 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	//출금 메소드
	public void withdraw(int money) {
		balance -=money;
	}
	
	//입금 메소드
	public void deposit(int money) {
		balance +=money;
	}
	
}


public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123546", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "789456", 2000);
		
		john.withdraw(400);
		mary.deposit(100);
		
		//출력
		System.out.println("◆John의 계좌");
		System.out.println("   계좌명의: " + john.getName());
		System.out.println("   계좌번호: " + john.getNo());
		System.out.println("   예금잔고: " + john.getBalance());
		System.out.println("   일련번호: " + john.getId());
		System.out.println();
		
		System.out.println("◆Mary의 계좌");
		System.out.println("   계좌명의: " + mary.getName());
		System.out.println("   계좌번호: " + mary.getNo());
		System.out.println("   예금잔고: " + mary.getBalance());
		System.out.println("   일련번호: " + mary.getId());
		System.out.println();
		
		System.out.println("◆Tomy의 계좌");
		System.out.println("   계좌명의: " + tomy.getName());
		System.out.println("   계좌번호: " + tomy.getNo());
		System.out.println("   예금잔고: " + tomy.getBalance());
		System.out.println("   일련번호: " + tomy.getId());
		System.out.println();
		
		//이 방법은 클래스 메소드를 사용함에 있어 인스턴스 메소드를 사용하고 있는 것처럼 보임, 맞고 아니고를 떠나서 추천하지 않는 방법
		//System.out.println("현재까지 생성된 계좌의 개수: " + tomy.getCount());
		
		//클래스 메소드를 사용하는 방법
		System.out.println("현재까지 생성된 계좌의 개수: " + Account.getCount());
		
	}
}
