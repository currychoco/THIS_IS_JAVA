package account;

//보통(일반) 예금 은행 계좌
public class Account{
	//멤버 변수
	private static int count = 0; //클래스 변수
	private int id = 0; //인스턴스 변수
	private String name;
	private String no;
	private int balance;
	
	/*
	Account(){
		++count;
		id = count;
	}
	*/
	
	//생성자 오버로딩
	public Account(String name, String no, int balance){
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
	
	//출력 메소드 1번
	public void printAccount() {
		System.out.println("◐식별번호: " + id);
		System.out.println("  계좌명의: " + name);
		System.out.println("  계좌번호: " + no);
		System.out.println("  예금잔고: " + balance);
	}
	
	//출력 메소드 2번
	public String toString() {
		return "♣No. " + id + ", 계좌명의: " + name + ", 번호: " + no + ", 잔고: " + balance;
	}
}