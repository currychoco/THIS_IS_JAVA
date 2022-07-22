import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열1 입력: ");
		String s1 = sc.next();
		System.out.print("문자열2 입력: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("============");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("============");
		//문자열을 콘솔로부터 입력하였을 때는 다른 인스턴스를 참조함
		//결과: 항상 다른 해시코드가 나옴
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("============");
		
		//두 개의 문자열의 비교
		// == 연산자: 참조의 비교하므로 항상 다르다는 결과를 출력
		//1번 방법- 잘못된 방법
		if(s1 == s2){
			System.out.println("두 문자열의 참조가 같습니다.");
		}else {
			System.out.println("두 문자열의 참조가 다릅니다.");
		}
		System.out.println("-----------");
		
		//2번 - 옳은 방법 (문자열의 비교)
		//equals(): 문자열의 참조가 아니라 값을 비교하기 때문
		if(s1.equals(s2)){
			System.out.println("두 문자열의 내용이 같습니다.");
		}else {
			System.out.println("두 문자열의 내용이 다릅니다.");
		}
		System.out.println("-----------");
		
		//3번 - 문자열을 비교할 때 대소문자의 구분없이 비교하는 방법
		//equalsIgnoreCase(): 문자열에서 대소문자 구분없이 비교
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("두 문자열의 내용이 같습니다.");
		}else {
			System.out.println("두 문자열의 내용이 다릅니다.");
		}
		
		sc.close();
	}
}