package day5;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());//1 				
		System.out.println("가나다".length());//3 				
		System.out.println("abc".charAt(1));//b
		System.out.println("abc".toUpperCase());//ABC	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4));//E -> EFGHIJ	        
		System.out.println(str1.substring(0, 3));//ABCD	-> ABC	
		System.out.println(str2.indexOf("f"));// 5	  
		System.out.println(str2.lastIndexOf("f")); //9 -> 7
		System.out.println(str2.replace('h', 'H'));//abcdefgHij 	    
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");   
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);//java \n html5 \n ccs3 \n javascript
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length);//25 ---- 25 -> 26 ---- 26
		System.out.println(ch);//java:html5:css3:javascript
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");//j a v a : h t m l 5 : c s s 3 : j a v a s c r i p t 
		}
	}
}













