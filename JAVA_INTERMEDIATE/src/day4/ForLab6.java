package day4;

public class ForLab6 {

	public static void main(String[] args) {
		final char DECO='&';
		int num = (int) (Math.random() * 6) + 5;
		//System.out.println(num);

		for (int row = 1; row <= num; row++) {
			for (int count = 1; count <= row; count++)
				System.out.print(DECO);
			System.out.println();
		}
	}
}
