import java.util.Scanner;

//문제1)학생수를 입력하여 int형 배열을 scores를 생성하고, 총점, 평균, 최고점수와 최저점수를 구하는 프로그램을 작성하시오
//각 학생의 점수를 입력하는 부분을 메소드로 만드시오. 메소드명: inputScore
//총점, 평균, 최고점수와 최저점수를 구하는 부분을 각각 메소드로 만드시오. 메소드명: calcTot, calcAve, calcMax,calcMin
public class Method06 {	
	static Scanner sc = new Scanner(System.in);
	
	static void inputScore(int[] a){
		for(int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번 학생 점수 입력: ");
			a[i] = sc.nextInt();
		}
	}
	//입력 메소드
	static int calcTot(int[] a) {
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		return tot;
	}
	//총점 계산 메소드
	static double calcAve(int[] a){
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		double ave = (double)tot / a.length;
		return ave;
	}
	
	//최고점수 계산 메소드
	static int calcMax(int[] a){
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	//최저점수 계산 메소드
	static int calcMin(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.print("학생수 입력: ");
		int n = sc.nextInt();
		int[] scores = new int[n];
		
		//학생 점수 입력
		inputScore(scores);
		int tot = calcTot(scores);
		double ave = calcAve(scores);
		int max = calcMax(scores);
		int min = calcMin(scores);
		
		//출력
		System.out.printf("총점: %d\n평균: %.2f\n최고점수: %d\n최저점수: %d", tot, ave, max, min);
		
		sc.close();	
	}
}
