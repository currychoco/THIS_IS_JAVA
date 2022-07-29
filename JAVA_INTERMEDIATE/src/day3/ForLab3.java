package day3;

public class ForLab3 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 10)+1; // 1~10
		int num2 = (int)(Math.random() * 11)+30; // 30~40
		int evenSum = 0;
		for(int n=num1; n <= num2; n++) {
			if(n % 2 == 0)
				evenSum = evenSum  + n;			
		}
		System.out.println(num1 + " 부터 " + num2 + " 까지의 짝수의 합 : " + evenSum);	
	}
}
