/*
<while문과 do-while문의 차이점>
1. while문은 조건을 만족하지 않으면 한 번도 실행되지 않을 수 있지만, do-while문은 조건을 만족하지 않더라도 반드시 한 번은 실행함
 */

public class While02 {

	public static void main(String[] args) {
		
		/*
		//1번
		int i =20;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		*/
		
		
		//2번
		int i =20;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);

	}

}
