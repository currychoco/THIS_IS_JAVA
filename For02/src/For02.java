import java.util.Scanner;

//����1) ���� 1���� �Է��Ͽ�, 1���� �Է��� ������ �߿��� Ȧ���� ����ϰ�, �� Ȧ���� �հ� ������ �Է��Ͻÿ�
//����2) ���� 1���� �Է��Ͽ�, 1���� �Է��� ������ 1�� �����Ͽ� �� �߿��� 3�� ����̸鼭 4�� ����� ���� ����ϰ�, �� ���� �հ�� ������ �����Ͻÿ�
public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Է�ȭ��
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		int sum = 0, count = 0;
		
		
		/*
		//1������
		//for������
		for(int i = 1; i <= n; i++) {
			
			if(i%2 == 1) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
			
		}
				
		//while������
		int i = 1;
		while(i <= n) {
			if(i%2 == 1) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
			i++;
		}	
		
		//do-while������
		int i = 1;
		do {
			if(i % 2 == 1) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
			i++;
		}while(i <= n);
		*/
		
		
		/*	
		for(int i = 1; i <= n; i++) {	
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
		}
		
		int i = 1;
		while(i <= n) {
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
			i++;
		}
		*/
		int i = 1;
		do {
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("��: %-3d  ��: %-3d  ����: %-3d\n", i, sum, count);
			}
			i++;
		}while(i <= n);
		
		sc.close();
	}
}
