/*
���� ���¸� Ŭ������ ����� �� ���α׷��� ������
 1. ������ ������ ������, �ּ��� ���ؼ� �� �� ���� -> �ذ�
 2. �� ����� ���¶�� �ϳ��� ��� ó���Ǿ�� ������ ������ �׷��� ���� -> �ذ�
 3. �ƹ��� ������ ������ ������ �� ����. ���¸���, ���¹�ȣ, �����ܰ� ������ ������ �� ���� -> �ذ����� ����
 
 <���� �����ִ� ������>
 1. Ȯ���� �ʱ�ȭ�� ���� ������ ���� �ʰ� ����
 2. �ƹ��� ������ ������ ������ �� ����
*/



//���� ���� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�
class Account{
	//�������
	//.(��� ����(access) ������)�����ڸ� ���� ����
	String name; 
	String no;
	int balance;
	
	//����Ʈ ������(�⺻ ������), default ������
	//Ŭ������ �����ϸ� ������ ����
	//�ٸ� ������ ������ ����Ʈ �����ڴ� ����� (�����ڸ� �����ε��ϸ� ����Ʈ �����ڴ� �����)
	Account(){
		
	}
}


public class AccountTset02 {
	public static void main(String[] args) {
		//1�� ���
		Account john = new Account(); //�ν��Ͻ�(instance, ��ü)
		
		//2�� ���
		/*Account john; 		 //Account Ŭ������ �������� 
		john = new Account();//Account Ŭ������ ��ü�� �����ǰ�, john�� �����ϰ� ��
		*/
		
		Account mary = new Account();
		
		//�ʱ�ȭ
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		john.balance -= 200;
		mary.balance += 700;
		
		//���
		System.out.println("��John�� ����");
		System.out.println("    ���¸���: " + john.name);
		System.out.println("    ���¹�ȣ: " + john.no);
		System.out.println("    ���ݹݰ�: " + john.balance);
		System.out.println();
		
		System.out.println("��Mary�� ����");
		System.out.println("    ���¸���: " + mary.name);
		System.out.println("    ���¹�ȣ: " + mary.no);
		System.out.println("    ���ݹݰ�: " + mary.balance);
	}
}
