import java.util.Scanner;

public class ProgrammingTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Է�: ");
		int height = sc.nextInt();
		System.out.print("���� �Է�: ");
		int width = sc.nextInt();
		
		for(int i = 0 ; i < height; i++) {
			for(int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
