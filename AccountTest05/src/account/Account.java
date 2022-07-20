package account;

//����(�Ϲ�) ���� ���� ����
public class Account{
	//��� ����
	private static int count = 0; //Ŭ���� ����
	private int id = 0; //�ν��Ͻ� ����
	private String name;
	private String no;
	private int balance;
	
	/*
	Account(){
		++count;
		id = count;
	}
	*/
	
	//������ �����ε�
	public Account(String name, String no, int balance){
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
	
	//��� �޼ҵ� 1��
	public void printAccount() {
		System.out.println("�Ľĺ���ȣ: " + id);
		System.out.println("  ���¸���: " + name);
		System.out.println("  ���¹�ȣ: " + no);
		System.out.println("  �����ܰ�: " + balance);
	}
	
	//��� �޼ҵ� 2��
	public String toString() {
		return "��No. " + id + ", ���¸���: " + name + ", ��ȣ: " + no + ", �ܰ�: " + balance;
	}
}