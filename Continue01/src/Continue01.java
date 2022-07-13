/*
 continue문
 -continue문을 만나면 반복문의 끝으로 이동함
 -continue문과 반복문의 끝 사이에 있는 실행문이 생략(제거)되는 역할을 함
 */


public class Continue01 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
