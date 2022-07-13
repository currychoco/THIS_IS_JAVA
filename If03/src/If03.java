import java.util.Scanner;

//문제1) 국어, 영어,수학 점수를 입력하여 총점, 평균, 학점을 계산하는 프로그램을 작성하시오
//평균이 90점 이상일 때 A, 80점 이상일 때 B, 70점 이상일 때 C, 60점 이상일 때 D, 그 미만은 F

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double ave;
		char grade;
		
		System.out.print("국어 점수를 입력하시오: ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하시오: ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하시오: ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		ave = (double)sum / 3;
		
		
		/*
		 * if(ave >= 90) { System.out.println("총점 : " + sum + " / 평균: " + ave +
		 * " / 학점: A"); } else if(ave >= 80) { System.out.println("총점 : " + sum +
		 * " / 평균: " + ave + " / 학점: B"); } else if(ave >= 70) {
		 * System.out.println("총점 : " + sum + " / 평균: " + ave + " / 학점: C"); } else
		 * if(ave >= 60) { System.out.println("총점 : " + sum + " / 평균: " + ave +
		 * " / 학점: D"); } else { System.out.println("총점 : " + sum + " / 평균: " + ave +
		 * "/ 학점: F"); }
		 */
		
		
		if(ave >= 90) {
			grade = 'A';
		} else if(ave >= 80) {
			grade = 'B';
		} else if(ave >= 70) {
			grade = 'C';
		} else if(ave >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("총점: " + sum + "\n평균: " + ave + "\n학점: " + grade);
		System.out.printf("총점: %d\n평균: %6.2f\n학점: %3c", sum, ave, grade);
		sc.close();
	}

}
