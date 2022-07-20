package account;

//���� ���� ���� ���� Ŭ����
public class TimeAccount extends Account{
	private int timeBalance;//���⿹�ݱݾ�
	
	//������
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.setTimeBalance(timeBalance);
	}

	//getter
	public int getTimeBalance() {
		return timeBalance;
	}
	//setter
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	//��� �޼ҵ� 1��
	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("  ���⿹���ܰ�: " + timeBalance);
	}
	
	//��� �޼ҵ� 2��
	@Override
	public String toString() {
		return super.toString() + ", ���⿹���ܰ�: " + timeBalance;
	}
	
	//���� ���� ���� �ؾ�
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
		
	}
}
