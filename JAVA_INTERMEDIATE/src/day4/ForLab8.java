package day4;

public class ForLab8 {   

	public static void main(String[] args) {

		char alpha = 'A';

		for (int row = 1; row <= 5; row++) {
			for (int count = 1; count <= row; count++)				
				System.out.print(alpha++);
			System.out.println();
		}
	}
}
