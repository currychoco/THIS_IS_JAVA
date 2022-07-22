/*
 JVM(Jav Virtual Machine, 자바 가상 머신)
 - 자바 프로그램을 실행할 때 내부적으로 함께 동작하는 프로세스
 - 역할: 메모리 관리, 예외에 대한 관리...
 
 - JVM 안에 Garbage Collector가 프로그램이 실행 중에 버려지는 메모리를 관리
 - Garbage Collector는 버려지는 메모리의 공가을 회수하여 재활용 할 수 있도록 함
 - Garbage Collection
 */

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; //새로운 문자열을 생성하는 것이 아니라, 기존에 있는 문자열을 참조
		String s4 = "DEF";
		s4 = s1; //s4는 s1이 참조하는 곳을 함께 참조하게 됨// 가비지 데이터가 생성됨 -> 가비지 컬렉터가 냠냠
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("==========");
		//해시코드(hashcode) - 각 인스턴스가 가지는 고유한 아이디
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}
}
