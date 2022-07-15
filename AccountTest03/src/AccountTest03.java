/*
 <���� ������(������)>
 1. private - �ڽ��� Ŭ���������� ���� ����
 2. default - �ƹ� Ű���嵵 ���� ���� ����, ���� ��Ű�������� ���� ����
 3. protected - ���� ��Ű���� ����, �ٸ� ��Ű���� ����� �޾Ҵٸ� ���� ����
 4. public - ��𿡼��� ���� ����
 */

class Account{
	//��� ����
	private String name;
	private String no;
	private int balance;
	
	//������(constructor)
	/*<�������� Ư¡>
	  1. Ŭ������ �̸��� ����  2. ���� Ÿ�� ����
	  <�������� ����>
	  1. Ȯ���� �ʱ�ȭ�� ���� ����
	  <�������� ȣ�� �ñ�>
	  1. �ν��Ͻ��� ������ �� ȣ��� -> Ȯ���� �ʱ�ȭ�� ���� ����
	 */
	Account(){
		
	}
	//������ �����ε�
	Account(String name, String no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	//setter �޼ҵ� - ��� ������ ���� �����ϴ� �޼ҵ�
	//getter �޼ҵ� - ��� ������ ���� Ȯ��(����)�ϴ� �޼ҵ�
	
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
	
	//��� �޼ҵ�
	public void withdraw(int money) {
		balance -=money;
	}
	
	//�Ա� �޼ҵ�
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
		
		//���
		System.out.println("��John�� ����");
		System.out.println("    ���¸���: " + john.getName());
		System.out.println("    ���¹�ȣ: " + john.getNo());
		System.out.println("    �����ܰ�: " + john.getBalance());
		System.out.println();
		
		System.out.println("��Mary�� ����");
		System.out.println("    ���¸���: " + mary.getName());
		System.out.println("    ���¹�ȣ: " + mary.getNo());
		System.out.println("    �����ܰ�: " + mary.getBalance());
		System.out.println();
	}
}
