import java.util.Scanner;

//정수 세 개를 입력하여, 그 중에서 최대값과 최소값을 구하는 프로그램을 작성하시오
//최대값, 최소값을 구하는 부분을 메소드로 작성하시오
//메소드명: calcMax, calcMin
public class Method05 {
	
	static int calcMax(int x, int y, int z) {
		int max = x;
		if(max < y) {
			max = y;
		}
		if(max < z) {
			max = z;
		}
		return max;
	}
	
	static int calcMin(int x, int y, int z) {
		int min = x;
		if(min > y) {
			min = y;
		}
		if(min > z) {
			min = z;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수x 입력: ");
		int x = sc.nextInt();
		System.out.print("정수y 입력: ");
		int y = sc.nextInt();
		System.out.print("정수z 입력: ");
		int z = sc.nextInt();
		
		int max = calcMax(x, y, z);
		int min = calcMin(x, y, z);
		
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		
		sc.close();
	}
}
