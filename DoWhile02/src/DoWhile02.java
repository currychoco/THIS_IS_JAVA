import java.util.Scanner;

//do-while���� Ȱ��
//�޴� ���� ȭ��
//1~4������ �޴��� �Է��ϰ�, 1~4�� �ƴ϶�� �޴�ȭ���� ��� �����ִ� ���α׷��� �ۼ��Ͻÿ�
public class DoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		//�޴� ���� ȭ��
		do {
			System.out.println("*** �޴����� ***");
			System.out.println("1�� - ���� ����");
			System.out.println("2�� - ���� �б�");
			System.out.println("3�� - ���� ����");
			System.out.println("4�� - ���� �ݱ�");
			System.out.print("�޴� �Է�(1~4): ");
			menu = sc.nextInt();
		//} while(menu<1 || menu>4);
		} while(!(menu>=1 && menu<=4)); // �� �𸣰��� ��Ģ
		
		//�޴��� ���� ó�� - switch-case
		switch(menu) {
		case 1:
			System.out.println("������ �������ϴ�.");
			break;
		case 2:
			System.out.println("������ �о����ϴ�.");
			break;
		case 3:
			System.out.println("������ ����ϴ�.");
			break;
		case 4:
			System.out.println("������ �ݾҽ��ϴ�.");
			break;
		}
		
		
		
		
		
		sc.close();
	}
}
