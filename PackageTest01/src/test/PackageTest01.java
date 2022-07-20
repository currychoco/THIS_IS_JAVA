package test;

import calc.Calc;
/*
 <패키지(package)>
 - 클래스를 묶어서 관리하기 위한 방법
 - 파일시스템의 폴더(디렉토리)와 비슷한 개념 + 접근 권한의 제한(한정)
 
 1. 패키지의 이름을 붙이는 방법
 - 반드시 지켜야 할 규칙: 프로젝트 내에서 유일한 이름이어야 함
 - 보편적인 방법: 패키지명은 전체 이름을 소문자로 함. 유일한 이름을 만드는 일반적인 방법(도메인 주소를 역순으로 적음)ex)com.ezen.www
 
 2. 패키지의 클래스를 통한 접근 권한
 - public 엑세스(접근 권한): 클래스 이름 앞에 public을 붙이는 방법
 -> 어디에서나 사용 가능한 클래스
 - default 엑세스(접근 권한): 패키지 엑세스, 클래스 이름 앞에 public을 붙이지 않는 방법
 -> 같은 패키지에서만 사용 가능한 클래스
 
 # 멤버에 대한 접근 권한
 - private < default < protected < public
 - private: 같은 클래스 내에서만 접근가능
 - default: 멤버의 접근 권한을적지 않은 상태, 같은 패키지 내에서만 접근 가능
 - protected: 같은 패키지에서는 물론이고, 패키지가 달라도 상속을 받았다면 접근 가능
 - public: 어디에서나 접근 가능
 */

public class PackageTest01 {	
	public static void main(String[] args) {
		Calc c1 = new Calc();
		System.out.println("덧셈: " + c1.add(5, 5));
		System.out.println("뺄셈: " + c1.subtract(10, 5));
		System.out.println("곱셈: " + c1.multiply(9, 9));
		System.out.println("나눗셈: " + c1.divide(9, 3));
	}
}
