
public class StringTest08 {
	public static void main(String[] args) {
		// 16. split(seperator): 구분자를 기준으로 문자열을 잘라서 문자열의 배열을 생성 
		// 콤마(구분자, seperater)를 기준으로 단어를 분리
		String words = "lion,tiger,bear,hyena,eagle,monkey,elephant";
		String[] animals = words.split(",");
		
		//출력 1
		for(int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
		for(String s : animals) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("----------");
		
		// 17. substring(): 문자열에서 특정 문자열을 추출하여 생성
		String s1 = "Hello Java World!";
		String s2 = s1.substring(6, 10); //6번부터 10번 앞까지
		System.out.println(s2);
		String s3 = s1.substring(0, 5); // 0번부터 5번 앞까지
		System.out.println(s3);
		String s4 = s1.substring(11, 17); //11번부터 17번 앞까지
		System.out.println(s4);
		String s5 = s1.substring(11); //11번부터 끝까지
		System.out.println(s5);
	}
}
