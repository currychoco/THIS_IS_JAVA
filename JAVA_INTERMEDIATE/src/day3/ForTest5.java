package day3;

public class ForTest5 {      

	public static void main(String[] args) {
		char letter = 'A';
		for(int n=0; n < 10; n++)
			System.out.print(letter);
		System.out.println("----------------");
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("----------------");
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("----------------");
		letter = '가';
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("----------------");
	}
}
