/*
 ��ü ���� ���α׷���(Object Oriented Programming Language)
 
 -��ü: �ΰ� ������ ��� �繰, ���¸� Ŭ������ ����� ������ ��
 -Ư¡: �繰�� ������ �Ӽ� (����)+ ����(�޼ҵ�)
 
 ��ü ������ �� ���� ���
 - ĸ��ȭ(Encapulation,Ŭ����), ���(Inheritance), ������(polymorphism)
 
 ���� ���� Ŭ����
 -���¸���, ���¹�ȣ, �����ܰ�
 
 ���� ���¸� Ŭ������ ����� �� ���α׷��� ������
 1. ������ ������ ������, �ּ��� ���ؼ� �� �� ����
 2. �� ����� ���¶�� �ϳ��� ��� ó���Ǿ�� ������ ������ �׷��� ����
 3. �ƹ��� ������ ������ ������ �� ����. ���¸���, ���¹�ȣ, �����ܰ� ������ ������ �� ����
*/



public class AccountTest01 {
	public static void main(String[] args) {
		
		//john ����	
		String jhonAccountname="John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		
		//mary�� ����
		String maryAccountName = "Mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		//johnAccountBalance -= 200;
		//maryAccountBalance += 100;
		
		System.out.println("* Jhon�� ����");
		System.out.println("  ���¸���: " + jhonAccountname);
		System.out.println("  ���¹�ȣ: " + johnAccountNo);
		System.out.println("  �����ܰ�: " + johnAccountBalance);
		
		System.out.println("* Mary�� ����");
		System.out.println("  ���¸���: " + maryAccountName);
		System.out.println("  ���¹�ȣ: " + maryAccountNo);
		System.out.println("  �����ܰ�: " + maryAccountBalance);
	}
}
