/*
2. do-while문

초기값;
do{

	실행문;
	...
	증감값;

} while(조건식);

 */


public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1; //초기값
		
		do
		{
			System.out.println(i + " Little Indian.");
			i++; // 증가값
		}while(i <= 10); // 조건식
	}

}
