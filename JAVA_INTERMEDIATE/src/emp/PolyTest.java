package emp;

class A{
	
}

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다")); 
		printObjectInfo("ABC"); 
		printObjectInfo(new java.io.File("c:/")); 
		printObjectInfo(new java.util.Date()); 
		printObjectInfo(new int[10]); 
		printObjectInfo(new double[5]); 
		printObjectInfo(new A()); 
		printObjectInfo(100);  // auto boxing
		printObjectInfo('가');  // auto boxing		
	}	
	
	static void printObjectInfo(Object obj) {
		//obj에 전달된 객체가 String 객체인지 체크해서 String객체이면 문자열의 길이 정보를 추가로 출력
		if(obj instanceof String) {
			System.out.println("문자열 객체가 전달됨: " + ((String)obj).length());
		}else {
			
		}
		
	}

}
