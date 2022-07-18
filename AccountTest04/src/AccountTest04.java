/*
 <����� ����>
 1. ��� ������ ����
 static�� �ִ� ������� - Ŭ���� ����, static field(���� �ʵ�)
 static�� ���� ������� - �ν��Ͻ� ����, non-static field(������ �ʵ�)
 
 �ν��Ͻ� ����, ������ �ʵ� - �ν��Ͻ��� ������ ������ ��������� ����
 Ŭ���� ����, ���� �ʵ� - �ش� Ŭ������ ����ϴ� ������ �� 1���� ���������, ��� �ν��Ͻ����� �����ϴ� ����
 
 2. ��� �޼ҵ��� ����
 static�� �ִ� �޼ҵ� - Ŭ���� �޼ҵ�, static method(���� �޼ҵ�)
 static�� ���� �޼ҵ� - �ν��Ͻ� �޼ҵ�, non-static method(������ �޼ҵ�)
 
 �ν��Ͻ� �޼ҵ�, ������ �޼ҵ� - �ν��Ͻ��� ������ ������ ��������� �޼ҵ�
 Ŭ���� �޼ҵ�, ���� �޼ҵ� - �ش� Ŭ������ ����ϴ� ������ �� 1���� ���������, ��� �ν��Ͻ����� �����ϴ� �޼ҵ�
 
*/


//����1) ��������� �ν��Ͻ��� ���� �� �� �ν��Ͻ��� ���� �Ϸù�ȣ�� ��������� �߰��Ͽ� ����Ͻÿ�
//�Ϸù�ȣ�� 1���� 1�� �ڵ����� �����ϵ��� ����, �Ϸù�ȣ��: id
class Account{
	//��� ����
	private static int count = 0; //Ŭ���� ����
	private int id = 0; //�ν��Ͻ� ����
	private String name;
	private String no;
	private int balance;
	
	Account(){
		++count;
		id = count;
	}
	//������ �����ε�
	Account(String name, String no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
		++count;
		id = count;
	}
	
	//Ŭ���� �޼ҵ�
	public static int getCount() {
		return count;
	}
	
	//�ν��Ͻ� �޼ҵ�
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
	
	//��� �޼ҵ�
	public void withdraw(int money) {
		balance -=money;
	}
	
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		balance +=money;
	}
	
}


public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123546", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "789456", 2000);
		
		john.withdraw(400);
		mary.deposit(100);
		
		//���
		System.out.println("��John�� ����");
		System.out.println("   ���¸���: " + john.getName());
		System.out.println("   ���¹�ȣ: " + john.getNo());
		System.out.println("   �����ܰ�: " + john.getBalance());
		System.out.println("   �Ϸù�ȣ: " + john.getId());
		System.out.println();
		
		System.out.println("��Mary�� ����");
		System.out.println("   ���¸���: " + mary.getName());
		System.out.println("   ���¹�ȣ: " + mary.getNo());
		System.out.println("   �����ܰ�: " + mary.getBalance());
		System.out.println("   �Ϸù�ȣ: " + mary.getId());
		System.out.println();
		
		System.out.println("��Tomy�� ����");
		System.out.println("   ���¸���: " + tomy.getName());
		System.out.println("   ���¹�ȣ: " + tomy.getNo());
		System.out.println("   �����ܰ�: " + tomy.getBalance());
		System.out.println("   �Ϸù�ȣ: " + tomy.getId());
		System.out.println();
		
		//�� ����� Ŭ���� �޼ҵ带 ����Կ� �־� �ν��Ͻ� �޼ҵ带 ����ϰ� �ִ� ��ó�� ����, �°� �ƴϰ� ������ ��õ���� �ʴ� ���
		//System.out.println("������� ������ ������ ����: " + tomy.getCount());
		
		//Ŭ���� �޼ҵ带 ����ϴ� ���
		System.out.println("������� ������ ������ ����: " + Account.getCount());
		
	}
}
