/*
 <접근 제한자(한정자)>
 1. private - 자신의 클래스에서만 접근 가능
 2. default - 아무 키워드도 쓰지 않은 상태, 같은 패키지에서만 접근 가능
 3. protected - 같은 패키지는 물론, 다른 패키지라도 상속을 받았다면 접근 가능
 4. public - 어디에서라도 접근 가능
 */

class Account{
	//멤버 변수
	private String name;
	private String no;
	private int balance;
	
	//생성자(constructor)
	/*<생성자의 특징>
	  1. 클래스의 이름과 같음  2. 리턴 타입 없음
	  <생성자의 역할>
	  1. 확실한 초기화에 대한 보장
	  <생성자의 호출 시기>
	  1. 인스턴스를 생성할 때 호출됨 -> 확실한 초기화에 대한 보장
	 */
	Account(){
		
	}
	//생성자 오버로딩
	Account(String name, String no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	//setter 메소드 - 멤버 변수의 값을 설정하는 메소드
	//getter 메소드 - 멤버 변수의 값을 확인(리턴)하는 메소드
	
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
	
	//출금 메소드
	public void withdraw(int money) {
		balance -=money;
	}
	
	//입금 메소드
	public void deposit(int money) {
		balance +=money;
	}
}

public class AccountTest03 {
	public static void main(String[] args) {
		Account john = new Account("John", "123546", 1000);
		Account mary = new Account("Mary", "654321", 500);
		
		john.withdraw(400);
		mary.deposit(100);
		
		//출력
		System.out.println("◆John의 계좌");
		System.out.println("    계좌명의: " + john.getName());
		System.out.println("    계좌번호: " + john.getNo());
		System.out.println("    예금잔고: " + john.getBalance());
		System.out.println();
		
		System.out.println("◆Mary의 계좌");
		System.out.println("    계좌명의: " + mary.getName());
		System.out.println("    계좌번호: " + mary.getNo());
		System.out.println("    예금잔고: " + mary.getBalance());
		System.out.println();
	}
}
