import java.util.Scanner;

//switch~case�� Ư¡ -if���� ���� Ȱ�뿡 ������ ������,
//	�������� ���������̰�, ���� �Ǵ� ���ڿ��� �� �������� ���� ������ ������ ���� �ڵ��� �������� ������
//switch~case�� Ȱ��
//����1) �ڽ��� �¾ ���� �Է��Ͽ�, ź��ȭ�� ����Ͻÿ�
public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �� �Է�: ");
		int month = sc.nextInt();
		String flower = "";
		
		
		if(month>0 && month<13) {
			switch(month) {
			case 1:
				flower = "ī���̼�";
				break;
			case 2:
				flower = "������";
				break;
			case 3:
				flower = "����";
				break;
			case 4:
				flower = "�Ƴ׸��";
				break;
			case 5:
				flower = "ƫ��";
				break;
			case 6:
				flower = "���";
				break;
			case 7:
				flower = "�عٶ��";
				break;
			case 8:
				flower = "��ͺ�";
				break;
			case 9:
				flower = "�پ˸���";
				break;
			case 10:
				flower = "�ұ�";
				break;
			case 11:
				flower = "����ȭ";
				break;
			case 12:
				flower = "�����";
				break;
			}
			System.out.println("����� �¾ " + month + "���� ź��ȭ�� " + flower + "�Դϴ�.");
		} else {
			System.out.println("1 ~ 12������ ������ �Է��Ͻÿ�");
		}
		
		sc.close();		
	}

}
