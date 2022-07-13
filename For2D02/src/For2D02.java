
//구구단출력
//과제1) 구구단을 가로로 펼쳐서 출력하시오

public class For2D02 {
	public static void main(String[] args) {
		
		for(int i =1; i <= 9; i++) {
			for(int j =2; j <=9; j++) {
				System.out.printf("%2d * %2d = %2d	", j, i, i*j);
			}
			System.out.println();
		}
	}
}
