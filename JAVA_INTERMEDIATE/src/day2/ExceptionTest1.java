package day2;

public class ExceptionTest1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("수행시작");
		Thread.sleep(3000); //프로그램 수행을 지연시키는 메소드 (3초)
		System.out.println("수행종료");
	}
}
