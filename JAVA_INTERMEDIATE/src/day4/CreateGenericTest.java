package day4;
import java.util.Date;

public class CreateGenericTest {
	public static void main(String[] args){
		
		Value1 o1 = new Value1();
		//o1.put(new Date());
		o1.put("abc");
		String s1 = o1.get();
		System.out.println(s1);
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); //부모는 자식을 받을 수 있지만 자식은 부모를 받을 수 없음
		System.out.println(s2);
		
		Value2 o3 = new Value2();
		o3.put(new Date());
		Date d1=(Date)o3.get();
		System.out.println(d1);
		
		Value3<String> o4 = new Value3<String>(); //헐 ㄷㄷ 이렇게 쓰면 
		o4.put("abc");
		String s3 = o4.get();//캐스팅 안 해도 됨 ㄷㄷ
		System.out.println(s3);
		
		Value3<Date> o5 = new Value3<Date>(); //헐 ㄷㄷ 이렇게 쓰면 
		o5.put(new Date());
		Date s4 = o5.get();//캐스팅 안 해도 됨 ㄷㄷ
		System.out.println(s4);
		
	}
}


class Value1{
	String obj;
	
	void put(String obj) {
		this.obj = obj;
	}
	
	String get() {
		return obj;
	}
}

class Value2{
	Object obj;
	
	void put(Object obj) {
		this.obj = obj;
	}
	
	Object get() {
		return obj;
	}
}

class Value3<T>{
	T obj;
	
	void put(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}
