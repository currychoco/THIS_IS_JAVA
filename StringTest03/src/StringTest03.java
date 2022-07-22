import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ�1 �Է�: ");
		String s1 = sc.next();
		System.out.print("���ڿ�2 �Է�: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("============");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("============");
		//���ڿ��� �ַܼκ��� �Է��Ͽ��� ���� �ٸ� �ν��Ͻ��� ������
		//���: �׻� �ٸ� �ؽ��ڵ尡 ����
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("============");
		
		//�� ���� ���ڿ��� ��
		// == ������: ������ ���ϹǷ� �׻� �ٸ��ٴ� ����� ���
		//1�� ���- �߸��� ���
		if(s1 == s2){
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		System.out.println("-----------");
		
		//2�� - ���� ��� (���ڿ��� ��)
		//equals(): ���ڿ��� ������ �ƴ϶� ���� ���ϱ� ����
		if(s1.equals(s2)){
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		System.out.println("-----------");
		
		//3�� - ���ڿ��� ���� �� ��ҹ����� ���о��� ���ϴ� ���
		//equalsIgnoreCase(): ���ڿ����� ��ҹ��� ���о��� ��
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("�� ���ڿ��� ������ �����ϴ�.");
		}else {
			System.out.println("�� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		
		sc.close();
	}
}