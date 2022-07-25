package day1;

class Person{
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	String getInfo() {
		return name;
	}
}

class Friend extends Person{
	String phoneNum;
	String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	@Override
	String getInfo() {
		return super.getInfo() + "   " + phoneNum + "   " + email;
	}
}

public class FriendTest {
	public static void main(String[] args) {
		
		Friend[] friends = new Friend[5];
		friends[0] = new Friend("전선유", "010-5555-4444", "abc@naver.com");
		friends[1] = new Friend("김효정", "010-3333-2222", "qwe@naver.com");
		friends[2] = new Friend("문예은", "010-2222-6666", "yui@naver.com");
		friends[3] = new Friend("이승효", "010-7777-1111", "dfg@naver.com");
		friends[4] = new Friend("윤병하", "010-4444-9999", "zxc@naver.com");
		
		System.out.println("이름     전화번호          메일주소");
		System.out.println("------------------------------------");
		for(Person p : friends) {
			System.out.println(p.getInfo());
		}
	}
}
