package test;

//단일형 import
import member.Member;
import member.SpecialMember;

//주문형 import
//import member.*;

public class MemberTest02 {
	public static void main(String[] args) {
		Member member = new Member(123456, "우영우", 27);
		SpecialMember specialMember = new SpecialMember(987654, "이준호", 29, "30%할인");
		
		System.out.println("일반회원: " + member.toString());
		System.out.println("특별회원: " + specialMember.toString());
		
	}

}
