package test;

//������ import
import member.Member;
import member.SpecialMember;

//�ֹ��� import
//import member.*;

public class MemberTest02 {
	public static void main(String[] args) {
		Member member = new Member(123456, "�쿵��", 27);
		SpecialMember specialMember = new SpecialMember(987654, "����ȣ", 29, "30%����");
		
		System.out.println("�Ϲ�ȸ��: " + member.toString());
		System.out.println("Ư��ȸ��: " + specialMember.toString());
		
	}

}
