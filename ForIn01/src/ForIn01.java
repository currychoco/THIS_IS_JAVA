
//enhanced for문(향상된 for문), 확장 for문, for-in문, for-each문
//확장 for문의 특징
//1. 인덱스가 없으므로 부분으로는 출력할 수 없고, 모든 요소를 순회하면서 출력하고자 할 때 사용
//2. 인덱스가 없으므로 값을 변경할 수 없음

public class ForIn01 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();

		// 확장 for문
		for (int i : a) {
			System.out.println(i);
		}

		double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		//기본 for문
		for(int i =0; i<d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		//확장 for문
		for(double x : d) {
			System.out.println(x);
		}
	}

}
