/*
은행 계좌를 클래스로 만들기 전 프로그램의 문제점
 1. 계좌의 정보를 변수명, 주석을 통해서 알 수 있음 -> 해결
 2. 한 사람의 계좌라면 하나로 묶어서 처리되어야 하지만 지금은 그렇지 않음 -> 해결
 3. 아무나 변수의 정보를 변경할 수 있음. 계좌명의, 계좌번호, 예금잔고를 누구나 변경할 수 있음 -> 해결하지 못함
 
 <아직 남아있는 문제점>
 1. 확실한 초기화에 대한 보장이 되지 않고 있음
 2. 아무나 변수의 정보를 변경할 수 있음
*/



//은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
class Account{
	//멤버변수
	//.(멤버 접근(access) 연산자)연산자를 통해 접근
	String name; 
	String no;
	int balance;
	
	//디폴트 생성자(기본 생성자), default 생성자
	//클래스를 생성하면 무조건 존재
	//다른 생성자 생성시 디폴트 생성자는 사라짐 (생성자를 오버로딩하면 디폴트 생성자는 사라짐)
	Account(){
		
	}
}


public class AccountTset02 {
	public static void main(String[] args) {
		//1번 방법
		Account john = new Account(); //인스턴스(instance, 실체)
		
		//2번 방법
		/*Account john; 		 //Account 클래스의 참조변수 
		john = new Account();//Account 클래스의 실체가 생성되고, john이 참조하게 됨
		*/
		
		Account mary = new Account();
		
		//초기화
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		john.balance -= 200;
		mary.balance += 700;
		
		//출력
		System.out.println("◆John의 계좌");
		System.out.println("    계좌명의: " + john.name);
		System.out.println("    계좌번호: " + john.no);
		System.out.println("    예금반고: " + john.balance);
		System.out.println();
		
		System.out.println("◆Mary의 계좌");
		System.out.println("    계좌명의: " + mary.name);
		System.out.println("    계좌번호: " + mary.no);
		System.out.println("    예금반고: " + mary.balance);
	}
}
