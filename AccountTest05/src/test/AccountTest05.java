package test;

import account.Account;
import account.TimeAccount;


public class AccountTest05 {
	public static void main(String[] args) {
		//�Ϲ� ����, ���� ���� �ν��Ͻ�
		Account a1 = new Account("�쿵��", "123456", 1000);
		TimeAccount a2 = new TimeAccount("����ȣ", "654321", 3000, 50);
		
		//������ ������ �⺻ ������ �Ǵ� ����
		Account x;
		x = a1;
		x = a2;//����: �θ��� ���������� �ڽ��� �ν��Ͻ��� ������ �� ����
		
		TimeAccount y;
		//y = a1;//�Ұ���: �ڽ��� ���������� �θ��� �ν��Ͻ��� ������ �� ���� 
		y = a2;
		
		//��� 1
		//a1.printAccount();
		//a2.printAccount();
		
		//��� 2
		System.out.println(a1);
		System.out.println(a2);
	}
}
