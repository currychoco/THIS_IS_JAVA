
public class Sort02 {

	public static void main(String[] args) {
		//int[] a = { 50, 70, 20, 10, 30 };
		
		int[] a = new int[10];
		
		for(int i =0; i<a.length; i++) {
			a[i]=(int)(Math.random()*90+10);
		}
		
		
		
		//버블정렬 전
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
		System.out.println();

		//버블 정렬 - 바로 인접한 배열의 값끼리 비교하여 정렬하는 방법
		for (int i = 0; i < a.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < (a.length-1) - i; j++) {
				if (a[j] > a[j + 1]) { //부등호에 따라 내림차순, 오름차순 나뉨
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					flag = true;
				}
			}
			if(!flag) {//flag == false
				break;
			}
			
			System.out.printf("%d번 회전 후: ",i+1);
			for(int j=0; j<a.length;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

}
