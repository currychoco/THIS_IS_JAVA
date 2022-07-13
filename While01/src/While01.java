/*
 <반복문>
 -loop문
 -while, do-while, for
 -반복문은 초기값 ,조건식, 증감값을 살펴봐야 함
 -반복문은 반복횟수를 파악하여야 함
 
 1. while
 기본 형식
 
 초기값
 while(조건식){
 	실행문;
 	...
 	증감값;
 }

 */

public class While01 {

	public static void main(String[] args) {
		
		/*
		//1번
		int i = 1; //초기값
		
		while(i <= 10) {//조건식
			System.out.println(i + " Little Indian.");//실행문
			i++; // 증감값
		}
		*/
		
		
		//2번- 10부터 1까지 반복
		/*
		int i = 10; //초기값
		
		while(i >= 1) {//조건식
			System.out.println(i + " Little Indian.");//실행문
			i--; // 증감
		}
		*/
		
		//3번 - 1부터 10까지 2씩 증가하면서 반복
		int i = 1; //초기값
		
		while(i <= 10) {//조건식
			System.out.println(i + " Little Indian.");//실행문
			i += 2; // 증감값
		}
		
	}
		
}
