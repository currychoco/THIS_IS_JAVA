import java.util.Scanner;

//문제2) A반의  학생 수를 입력하여, 입력한 학생 수만큼의 scores배열을 생성하고, 각 학생의 점수도 입력하여, 각 학생의 점수를 출력하고, 총점과 평균을 계산하시오
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double ave = 0.0;
		
		System.out.print("A반학 생 수 입력: ");
		int num = sc.nextInt();
		int[] scores = new int[num];
		
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 학생의 점수를 입력하시오: ");
			scores[i] = sc.nextInt();
			sum += scores[i];	
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수는 " + scores[i] + "점입니다.");
		}
		System.out.println();
		
		ave = (double)sum / scores.length;
		
		System.out.println("A반 학생 총점: " + sum + "\nA반 학생 평균: " + ave);
		
		sc.close();
	}

}
