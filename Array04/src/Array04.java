import java.util.Scanner;

//����2) A����  �л� ���� �Է��Ͽ�, �Է��� �л� ����ŭ�� scores�迭�� �����ϰ�, �� �л��� ������ �Է��Ͽ�, �� �л��� ������ ����ϰ�, ������ ����� ����Ͻÿ�
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double ave = 0.0;
		
		System.out.print("A���� �� �� �Է�: ");
		int num = sc.nextInt();
		int[] scores = new int[num];
		
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "��° �л��� ������ �Է��Ͻÿ�: ");
			scores[i] = sc.nextInt();
			sum += scores[i];	
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "��° �л��� ������ " + scores[i] + "���Դϴ�.");
		}
		System.out.println();
		
		ave = (double)sum / scores.length;
		
		System.out.println("A�� �л� ����: " + sum + "\nA�� �л� ���: " + ave);
		
		sc.close();
	}

}
