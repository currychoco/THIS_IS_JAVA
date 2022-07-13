import java.util.Scanner;

//문제1) 국어, 영어,수학 점수를 입력하여 총점, 평균, 학점을 계산하는 프로그램을 작성하시오
//평균이 90점 이상일 때 A, 80점 이상일 때 B, 70점 이상일 때 C, 60점 이상일 때 D, 그 미만은 F
//학점은 switch~case문으로 작성하시오
public class Switch04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, mat, sum, n;
		double ave;
		char grade;
		
		//입력화면설계
		System.out.print("국어 점수를 입력하시오: ");
		kor = sc.nextInt();

		System.out.print("영어 점수를 입력하시오: ");
		eng = sc.nextInt();

		System.out.print("수학 점수를 입력하시오: ");
		mat = sc.nextInt();

		//계산
		sum = kor + eng + mat;
		ave = (double) sum / 3;

		
		switch((int)ave / 10) { // 와 10으로 나눌 생각은 못했네
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
			
		
		/*
		if (ave >= 90) {
			n = 1;
		} else if (ave >= 80) {
			n = 2;
		} else if (ave >= 80) {
			n = 3;
		} else if (ave >= 80) {
			n = 4;
		} else {
			n = 5;
		}
		
		switch(n) {
		case 1:
			grade = 'A';
			break;
		case 2:
			grade = 'B';
			break;		
		case 3:
			grade = 'C';
			break;
		case 4:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		*/
		
		System.out.println("총점: " + sum + "\n평균: " + ave + "\n학점: " + grade);
		System.out.printf("총점 : %d\n평균: %.2f학점: %c", sum, ave, grade);

		sc.close();
	}

}
