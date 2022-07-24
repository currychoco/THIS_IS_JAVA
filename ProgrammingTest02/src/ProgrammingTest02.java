import java.util.Scanner;

public class ProgrammingTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �Է�: ");
		int num = sc.nextInt();
		
		int[] scores = new int[num];
		
		int sum = 0;
		double ave = 0;
		char grade;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "��° �л� ���� �Է�: ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		ave = (double)sum / num;
		
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
		System.out.printf("����: %d\n", sum);
		System.out.printf("���: %.2f\n", ave);
		System.out.printf("����: %c\n", grade);
		
		
		sc.close();
	}
}
