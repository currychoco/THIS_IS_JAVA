/*
 2. ���ǹ�
 - switch~case~break��
 - ������ ��: switch~case���� ���ǿ��� �ݵ�� ������ ���ڿ��� ����
 - �Ǽ��� �������� ����� �� ����
 - switch������ ���� �� �ִ� ��� ���ǹ��� if������ ���� �� ������, 
 	�ݴ�� if������ ���� �� �ִ� ��� ���� switch������ ���� ���� ����
 
 switch(����){
 case ���� �Ǵ� ���ڿ�:
 	���๮;
 	break;
 case ���� �Ǵ� ���ڿ�:
 	���๮;
 	break;
  case ���� �Ǵ� ���ڿ�:
 	���๮;
 	break;
 default:
 	���๮;
 	break;
 }
 */

// ';'Label�� ����(�� ���� ã�� ����)

public class Switch01 {

	public static void main(String[] args) {
		
		int menu = 2;
		
		switch(menu) {
		case 1:
			System.out.println("���� ����");
			break;
		case 2:
			System.out.println("���� �б�");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		case 4:
			System.out.println("���� �ݱ�");
			break;
		default:
			System.out.println("�ٽ� �Է�");
			break;
		}
		

	}

}
