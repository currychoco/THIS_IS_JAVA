
/*
 break문
 -switch-case문과 반복문 1개를 빠져나가는 역할을 함
 -
 
 */

public class Break01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i == 6) {
				break;
			}
			System.out.println(i);
		}

	}

}
