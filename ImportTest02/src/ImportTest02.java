//1. ������ import - Ŭ�������� ���� import�� �ϴ� ���
//import java.util.Scanner;
//import java.util.Random;

//2. �ֹ��� import - �ش� ��Ű������ ����ϴ� Ŭ������ ��� import�ϴ� ���
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("���� �Է�(0~9): ");
		int x = sc.nextInt();
		
		//���� ����(0~9������ ����)
		//nextInt(): int���� ���� ���� ����, -21�� ..~21��..
		int y = r.nextInt(10);
		
		if(x == y) {
			System.out.println("������ ����� �ִ� ���Դϴ�.");
		}else {
			System.out.println("������ ����� ���Դϴ�.");
		}
		
	}
}
