
public class Array2D02 {
	public static void main(String[] args) {
		
		//3번 방법 - 2차원 배열을 선언하고 바로 값을 초기화
		//선언하고 바로 초기화를 할 때는 new int[][]을 생략할 수 있음
		/*int[][] a = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};*/
		
		
		//4번 방법
		//2차원 배열의 참조변수 선언과 초기화를 분리할 때는 반드시 new int[][]을 써야함
		int[][] a;
		a = new int[][]{
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}
