//System.in: 입력 스트림(input stream)
//System.out: 출력 스트림(output stream)


// 국어, 영어, 수학 점수를 입력하여, 총점과 평균을 계산하는 프로그램을 만드시오

//캐스팅(Casting): 강제로 데이터 타입을 변경하는 것. 이항수치승격..?

import java.util.Scanner;
public class Casting01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, mat, eng;
		
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		
		System.out.print("수학 점수: ");
		mat = sc.nextInt();
		
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double ave = (double)sum / 3; //캐스팅(Casting)
		
		System.out.println("총점: "+ sum + "\n평균: " + ave);
		
		sc.close();
		
	}
}
