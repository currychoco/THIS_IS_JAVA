//import java.util.Scanner;


public class ImportTest01 {
	public static void main(String[] args) {
		//1. 완전수식명(Full Qualified Name, FQN)
		//패키지를 포함한 클래스의 전체 경로를 통해 클래스를 사용하는 방법
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//2. 단순명(SimpoleName, SN)
		//클래스의 패키지를 import하고, 인스턴스는 클래스 이름만으로 생성하는 방법
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.println("입력한 정수는 " + n + "입니다.");
	}
}
