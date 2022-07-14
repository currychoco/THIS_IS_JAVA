
//선택정렬 (Selection Sort) - i가 j를 선택하면서 정렬하는 방법
public class Sort01 {

	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30};

		
		//정렬 전
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		//선택정렬
		for(int i = 0; i <a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) { //부등호에 따라 내림차순 오름차순으로 나뉨
					int t =a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.printf("%d번 회전 후: ",i+1);
			for(int j=0; j<a.length;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//정렬 후
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
	}

}
