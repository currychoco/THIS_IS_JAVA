
/*
 배열(Array) - 같은 타입의 변수의 집합
 장점 - 반복문을 통한 일괄 처리 가능
 */
public class Array01 {
	public static void main(String[] args) {
		//1번 방법
		//int[] a; // int형의 데이터가 있는 곳을 참조하는 1차원 배열의 참조변수 a
		//a = new int[5];//int형의 데이터가 5개 있고, 이 데이터를 참조변수 a가 참조하고 있음
		
		//2번 방법
		int[] a = new int[5];
		
		//배열에 값을 대입
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//a.length = 10; 배수의 개수를 저장하는 length 변수는 값을 변경할 수 없음
		
		//반복문을 사용하여 배열의 값을 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]); 예외 발생: 배열의 개수가 5이면 a[0]~a[4]까지 존재, a[5]는 없음		
		*/
		
		
	}

}
