import java.util.Scanner;

//���� �� ���� �Է��Ͽ�, �� �߿��� �ִ밪�� �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//�ִ밪, �ּҰ��� ���ϴ� �κ��� �޼ҵ�� �ۼ��Ͻÿ�
//�޼ҵ��: calcMax, calcMin
public class Method05 {
	
	static int calcMax(int x, int y, int z) {
		int max = x;
		if(max < y) {
			max = y;
		}
		if(max < z) {
			max = z;
		}
		return max;
	}
	
	static int calcMin(int x, int y, int z) {
		int min = x;
		if(min > y) {
			min = y;
		}
		if(min > z) {
			min = z;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����x �Է�: ");
		int x = sc.nextInt();
		System.out.print("����y �Է�: ");
		int y = sc.nextInt();
		System.out.print("����z �Է�: ");
		int z = sc.nextInt();
		
		int max = calcMax(x, y, z);
		int min = calcMin(x, y, z);
		
		System.out.println("�ּҰ�: " + min);
		System.out.println("�ִ밪: " + max);
		
		sc.close();
	}
}
