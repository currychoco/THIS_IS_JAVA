
//2차원 배열의 기본

public class Array2D01 {
	public static void main(String[] args) {
		//1번 방법 - 각 행의 열의 개수가 다를 때 사용 가능
		/*
		int[][] a;		//int형의 2차원 배열을 참조하는 참조변수a 선언
		
		a = new int[3][4]; //행이 3개
		a[0]= new int[4]; //
		a[1]= new int[4];
		a[2]= new int[4];
		
		//2차원 배열의 값 대입
		a[0][1] = 10;
		a[1][2] = 20;
		a[2][3] = 30;
		*/
		
		//2번 방법 - 각 행의 열의 개수가 동일할 때 사용
		int[][] a = new int[3][4];
		
		
		
		
		//2차원 배열의 출력
		for(int i = 0; i < a.length; i++) { // a.length: 행의 개수
			for(int j = 0; j < a[i].length; j++) { // a[i].length: 각 행에 대한 열의 개수
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

}
