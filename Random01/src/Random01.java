
//난수(Random Number) 만들기
//무작위수
//Math.random(): 0에서 1미만의 난수를 생성, 0 ~ 0.999999...
public class Random01 {
	public static void main(String[] args) {
		
		//1. 0 ~ 9 사이의 난수
		//int rn = (int)(Math.random() * 10);
		
		//2. 1 ~ 10 사이의 난수
		//int rn = (int)(Math.random() * 10) + 1;
		
		//3. 두 자리수의 난수, 10 ~ 99사이의 난수
		int rn = (int)(Math.random() * 90) + 10;
		
		System.out.println(rn);
		System.out.println(Math.PI);
	}

}
