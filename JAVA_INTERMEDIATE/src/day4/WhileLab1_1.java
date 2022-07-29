package day4;

public class WhileLab1_1 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+5;
		for(int n=1; n<=num; n++)
			System.out.println(n+"->"+n*n);
		System.out.println();
		int n=1;
		while(n<=num) {
			System.out.println(n+"->"+n*n);
			n++;
		}
	}

}
