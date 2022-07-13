/*
 2. 조건문
 - switch~case~break문
 - 주의할 점: switch~case문의 조건에는 반드시 정수와 문자열만 가능
 - 실수는 조건으로 사용할 수 없음
 - switch문으로 만들 수 있는 모든 조건문은 if문으로 만들 수 있지만, 
 	반대로 if문으로 만들 수 있는 모든 것을 switch문으로 만들 수는 없음
 
 switch(조건){
 case 정수 또는 문자열:
 	실행문;
 	break;
 case 정수 또는 문자열:
 	실행문;
 	break;
  case 정수 또는 문자열:
 	실행문;
 	break;
 default:
 	실행문;
 	break;
 }
 */

// ';'Label의 역할(한 번에 찾는 역할)

public class Switch01 {

	public static void main(String[] args) {
		
		int menu = 2;
		
		switch(menu) {
		case 1:
			System.out.println("파일 열기");
			break;
		case 2:
			System.out.println("파일 읽기");
			break;
		case 3:
			System.out.println("파일 쓰기");
			break;
		case 4:
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("다시 입력");
			break;
		}
		

	}

}
