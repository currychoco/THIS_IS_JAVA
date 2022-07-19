//1. 단일형 import - 클래스별로 각각 import를 하는 방법
//import java.util.Scanner;
//import java.util.Random;

//2. 주문형 import - 해당 패키지에서 사용하는 클래스를 모두 import하는 방법
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("정수 입력(0~9): ");
		int x = sc.nextInt();
		
		//난수 생성(0~9사이의 난수)
		//nextInt(): int형의 범위 안의 숫자, -21억 ..~21억..
		int y = r.nextInt(10);
		
		if(x == y) {
			System.out.println("오늘은 행운이 있는 날입니다.");
		}else {
			System.out.println("오늘은 평범한 날입니다.");
		}
		
	}
}
