//import java.util.Scanner;


public class ImportTest01 {
	public static void main(String[] args) {
		//1. �������ĸ�(Full Qualified Name, FQN)
		//��Ű���� ������ Ŭ������ ��ü ��θ� ���� Ŭ������ ����ϴ� ���
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//2. �ܼ���
		//Ŭ������ ��Ű���� import�ϰ�, �ν��Ͻ��� Ŭ���� �̸������� �����ϴ� ���
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		System.out.println("�Է��� ������ " + n + "�Դϴ�.");
	}
}
