package day4;

public class ForLab9 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 2) + 1;
		int dan  = num == 1 ?  1  :  2;

		for (; dan <= 9; dan += 2) {
			for (int num1 = 1; num1 <= 9; num1++)
				System.out.print(dan + "x" + num1 + "=" + dan * num1 + "\t");
			System.out.println();
		}

		/*if (num == 1)
			for (int oddNum = 1; oddNum <= 9; oddNum += 2) {
				for (int num1 = 1; num1 <= 9; num1++)
					System.out.print(oddNum + "x" + num1 + "=" + oddNum * num1 + "\t");
				System.out.println();
			}
		else
			for (int oddNum = 2; oddNum <= 8; oddNum += 2) {
				for (int num1 = 1; num1 <= 9; num1++)
					System.out.print(oddNum + "x" + num1 + "=" + oddNum * num1 + "\t");
				System.out.println();
			}*/
	}
}
