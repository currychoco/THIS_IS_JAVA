import java.util.Scanner;

//����1) ����, ����,���� ������ �Է��Ͽ� ����, ���, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//����� 90�� �̻��� �� A, 80�� �̻��� �� B, 70�� �̻��� �� C, 60�� �̻��� �� D, �� �̸��� F

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double ave;
		char grade;
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		kor = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		eng = sc.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		ave = (double)sum / 3;
		
		
		/*
		 * if(ave >= 90) { System.out.println("���� : " + sum + " / ���: " + ave +
		 * " / ����: A"); } else if(ave >= 80) { System.out.println("���� : " + sum +
		 * " / ���: " + ave + " / ����: B"); } else if(ave >= 70) {
		 * System.out.println("���� : " + sum + " / ���: " + ave + " / ����: C"); } else
		 * if(ave >= 60) { System.out.println("���� : " + sum + " / ���: " + ave +
		 * " / ����: D"); } else { System.out.println("���� : " + sum + " / ���: " + ave +
		 * "/ ����: F"); }
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
		
		System.out.println("����: " + sum + "\n���: " + ave + "\n����: " + grade);
		System.out.printf("����: %d\n���: %6.2f\n����: %3c", sum, ave, grade);
		sc.close();
	}

}
