import java.util.Scanner;

//����1)�л����� �Է��Ͽ� int�� �迭�� scores�� �����ϰ�, ����, ���, �ְ������� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//�� �л��� ������ �Է��ϴ� �κ��� �޼ҵ�� ����ÿ�. �޼ҵ��: inputScore
//����, ���, �ְ������� ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����ÿ�. �޼ҵ��: calcTot, calcAve, calcMax,calcMin
public class Method06 {	
	static Scanner sc = new Scanner(System.in);
	
	static void inputScore(int[] a){
		for(int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "�� �л� ���� �Է�: ");
			a[i] = sc.nextInt();
		}
	}
	//�Է� �޼ҵ�
	static int calcTot(int[] a) {
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		return tot;
	}
	//���� ��� �޼ҵ�
	static double calcAve(int[] a){
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		double ave = (double)tot / a.length;
		return ave;
	}
	
	//�ְ����� ��� �޼ҵ�
	static int calcMax(int[] a){
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	//�������� ��� �޼ҵ�
	static int calcMin(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.print("�л��� �Է�: ");
		int n = sc.nextInt();
		int[] scores = new int[n];
		
		//�л� ���� �Է�
		inputScore(scores);
		int tot = calcTot(scores);
		double ave = calcAve(scores);
		int max = calcMax(scores);
		int min = calcMin(scores);
		
		//���
		System.out.printf("����: %d\n���: %.2f\n�ְ�����: %d\n��������: %d", tot, ave, max, min);
		
		sc.close();	
	}
}
