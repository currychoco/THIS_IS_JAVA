//System.in: �Է� ��Ʈ��(input stream)
//System.out: ��� ��Ʈ��(output stream)


// ����, ����, ���� ������ �Է��Ͽ�, ������ ����� ����ϴ� ���α׷��� ����ÿ�

//ĳ����(Casting): ������ ������ Ÿ���� �����ϴ� ��. ���׼�ġ�°�..?

import java.util.Scanner;
public class Casting01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, mat, eng;
		
		System.out.print("���� ����: ");
		kor = sc.nextInt();
		
		System.out.print("���� ����: ");
		mat = sc.nextInt();
		
		System.out.print("���� ����: ");
		eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double ave = (double)sum / 3; //ĳ����(Casting)
		
		System.out.println("����: "+ sum + "\n���: " + ave);
		
		sc.close();
		
	}
}
