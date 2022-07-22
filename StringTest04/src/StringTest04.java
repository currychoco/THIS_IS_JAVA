
public class StringTest04 {
	public static void main(String[] args) {
		
		//null 상태: 아무곳도 참조하지 않은 상태
		String s1 = null;
		String s2 = ""; //아무 데이터도 없는 곳을 참조
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("----------");
		//System.out.println(s1.hashCode()); //NullPointerException 예외 발생
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s2));
		System.out.println("----------");
		char[] c = new char[] {'H', 'E', 'L', 'L', 'O'};
		System.out.println(c);
		String s3 = new String(c);
		System.out.println(s3);
	}
}
