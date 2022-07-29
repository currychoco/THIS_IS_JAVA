package day4;

public class WhileLab1 {

	public static void main(String[] args) {
		int ran = (int) (Math.random() * 6) + 5;
		int x2;
		System.out.println("[ for 결과 ]");
		for (int num = 1; num <= ran; num++) {
			x2 = num * num;
			System.out.println(num + " -> " + x2);
		}
		System.out.println();		
		int num=1;
		System.out.println("[ while 결과 ]");
		while (num <= ran) {			
			System.out.print(num);
			x2=num*num;
			System.out.println(" ->" + x2);
			num++;
		}
	}
}
