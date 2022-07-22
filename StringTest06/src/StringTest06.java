
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";
		
		// 4. endsWith(s): 문자열이 특정 문자열로 끝나는가의 여부를 알려주는 메소드
		System.out.println(s1.endsWith("txt"));
		
		if(s1.endsWith("txt")) {
			System.out.println("업로드 되었습니다.");
		}else {
			System.out.println("업로드 되지 않았습니다.");
			System.out.println("파일형식을 txt 파일로 변경하여 업로드해 주세요.");
		}
		
		// 5. startsWith(s): 문자열이 특정 문자열로 시작하는가의 여부를 알려주는 메소드
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		System.out.println("----------");
		
		// 6. indexOf(s): 문자열에서 특정 문자열의 인덱스를 알려줌
		//charAt(index): 인덱스에 해당하는 문자를 알려줌
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.charAt(6));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("JAVA")); //-1, 특정 문자열을 찾지 못했을 때, 배열의 인덱스에 존재할 수 없는 값
		System.out.println("----------");
		
		// 7. lastIndexOf(s): 문자열에서 특정 문자열의 인덱스를 뒤에서부터 찾아서 알려줌
		// indexOf(s): 문자열에서 특정 문자열의 인덱스를 앞에서부터 찾아서 알려줌
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("Java"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.lastIndexOf("JAVA")); // -1, 특정 문자열을 찾지 못했을 때 
		System.out.println(s1.lastIndexOf(".")); // 16
	}
}
