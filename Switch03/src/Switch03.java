import java.util.Scanner;

//����1) ���� �Է��Ͽ�, ������ �Ǻ��Ͻÿ�
// 3, 4, 5 �� / 6, 7, 8 ���� / 9, 10 ,11 ����/ 12, 1, 2 �ܿ�
//��¿���: 7���� �����Դϴ�
public class Switch03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int month = sc.nextInt();
		String season = "";
		
		System.out.println(month + "���� " + season + "�Դϴ�.");
		
		if(month>0 && month<13) {
			switch(month) {
			case 3: case 4: case 5:
				season = "��";
				break;
			case 6: case 7: case 8:
				season = "����";
				break;
			case 9: case 10: case 11:
				season = "����";
				break;
			case 12: case 1: case 2:
				season = "�ܿ�";
				break;
			}
			System.out.println(month + "���� " + season + "�Դϴ�.");
		} else {
			System.out.println("1 ~ 12������ ������ �Է��Ͻÿ�");
		}
		
		sc.close();
	}

}
