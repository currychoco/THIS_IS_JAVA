import java.util.Scanner;

//����1) ����, ����,���� ������ �Է��Ͽ� ����, ���, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//����� 90�� �̻��� �� A, 80�� �̻��� �� B, 70�� �̻��� �� C, 60�� �̻��� �� D, �� �̸��� F
//������ switch~case������ �ۼ��Ͻÿ�
public class Switch04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, mat, sum, n;
		double ave;
		char grade;
		
		//�Է�ȭ�鼳��
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		kor = sc.nextInt();

		System.out.print("���� ������ �Է��Ͻÿ�: ");
		eng = sc.nextInt();

		System.out.print("���� ������ �Է��Ͻÿ�: ");
		mat = sc.nextInt();

		//���
		sum = kor + eng + mat;
		ave = (double) sum / 3;

		
		switch((int)ave / 10) { // �� 10���� ���� ������ ���߳�
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
		
		System.out.println("����: " + sum + "\n���: " + ave + "\n����: " + grade);
		System.out.printf("���� : %d\n���: %.2f����: %c", sum, ave, grade);

		sc.close();
	}

}
