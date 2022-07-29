package day4;

public class WhileLab3 {

	public static void main(String[] args) {
		int ran;
		char askii=64;
		int count=0;
		while (true) {
			ran=(int)(Math.random()*30);
			if (ran==0)
				break;
			else if (ran>=27)
				break;
			System.out.println((char)(askii+ran) + "(" + ran + ")");
			System.out.println();		
			count++;
		}
		System.out.println("수행횟수는 " + count + " 번입니다.");

	}

}
