package test;

import account.Account;
import account.TimeAccount;


public class AccountTest05 {
	public static void main(String[] args) {
		//일반 에금, 정기 예금 인스턴스
		Account a1 = new Account("우영우", "123456", 1000);
		TimeAccount a2 = new TimeAccount("이준호", "654321", 3000, 50);
		
		//다형성 구현의 기본 원리가 되는 개념
		Account x;
		x = a1;
		x = a2;//가능: 부모의 참조변수는 자식의 인스턴스를 참조할 수 있음
		
		TimeAccount y;
		//y = a1;//불가능: 자식의 참조변수는 부모의 인스턴스를 참조할 수 없음 
		y = a2;
		
		//출력 1
		//a1.printAccount();
		//a2.printAccount();
		
		//출력 2
		System.out.println(a1);
		System.out.println(a2);
	}
}
