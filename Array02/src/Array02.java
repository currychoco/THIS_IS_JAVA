
public class Array02 {
	public static void main(String[] args) {
		//3번 방법 - 배열을 선언하고, 바로 값을 대입하는 방법
		//int[] a = new int[]{10, 20, 30, 40, 50};
		
		//배열을 선언하고 바로 초기화를 할 때는 new int[]를 생략할 수 있음
		int[] a = {10, 20, 30, 40, 50}; 
		
		//4번 방법
		//배열의 선언과 초기를 분리할 때는 반드시 new int[]을 써야만 함
		//int[] a;
		//a = new int[]{10, 20, 30, 40, 50};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
	
}
