package account;

//정기 예금 은행 계좌 클래스
public class TimeAccount extends Account{
	private int timeBalance;//정기예금금액
	
	//생성자
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
	
	//출력 메소드 1번
	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("  정기예금잔고: " + timeBalance);
	}
	
	//출력 메소드 2번
	@Override
	public String toString() {
		return super.toString() + ", 정기예금잔고: " + timeBalance;
	}
	
	//정기 예금 계좌 해약
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
		
	}
}
