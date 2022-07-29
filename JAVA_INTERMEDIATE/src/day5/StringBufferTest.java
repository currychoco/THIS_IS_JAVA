package day5;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer();//아규먼트를 안 주면 16
		String str = "자바프로그래밍";
     	buffer.append(str);

        System.out.printf("%s\n", buffer);
        
        System.out.printf("길이 : %d\n", buffer.length());
        
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append('자');
        buffer2.append('바');
        buffer2.append('프');
        buffer2.append('로');
        buffer2.append('그');
        buffer2.append('래');
        buffer2.append('밍');
        
        System.out.println(buffer == buffer2);
        System.out.println(buffer.equals(buffer2)); //==와 동일
        System.out.println(buffer.toString().equals(buffer2.toString()));
        
        buffer.reverse();
        System.out.printf("%s\n", buffer);
	}
}






