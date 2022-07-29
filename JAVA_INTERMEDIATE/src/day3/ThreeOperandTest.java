package day3;

public class ThreeOperandTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		
		if (num % 2 == 0) {
			System.out.println(num + " : 짝수");
		} else { 
			System.out.println(num + " : 홀수");
		}
		
		System.out.println(num % 2 == 0 ? num + " : 짝수" : num + " : 홀수");
	}
}
