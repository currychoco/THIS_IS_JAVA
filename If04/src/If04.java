import java.util.Scanner;

//���� 1) ���� �Է��Ͽ� ������ �Ǻ��Ͻÿ� (if������ �ۼ�)
// 3, 4, 5 �� / 6, 7, 8 ���� / 9, 10 ,11 ����/ 12, 1, 2 �ܿ�

//&&: �̰�, �̸鼭
//||: �̰ų�, �Ǵ�
public class If04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		String season = "";
		
		System.out.print("���� �Է��Ͻÿ�: ");
		month = sc.nextInt();
		
		//1��
		/*
		if(month == 3 || month == 4 || month == 5) {
			season = "��";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "����";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "����";
		}else {
			season = "�ܿ�";
		}
		*/
		
		
		//2��
		if(month>=3 && month<=5) {
			season = "��";
		} else if(month>=6 && month<=8) {
			season = "����";
		} else if(month>=9 && month<=11) {
			season = "����";
		} else if(month==12 || month<=1&&month>=2) {
			season = "�ܿ�";
		} else {
			season = "����";
		}
		
		System.out.println(month + "���� " + season + "�Դϴ�.");
		
		sc.close();
		
	}
}
