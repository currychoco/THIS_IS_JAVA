package day1;

class Member{
	
	String name;
	String account;
	String passwd;
	int birthyear;
	int count = 0;;
	
	Member(String name, String account, String passwd, int birthyear){
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthyear = birthyear;
		++count;
	}
	
	void showInfo() {
		System.out.println("회원" + count + ": " + name + "(" + account + ", " + passwd + ", " + birthyear + ")");
	}
	
	
	
}

public class MemberTest {
	public static void main(String[] args) {
		Member[] members = {
				new Member("이혜량", "asdf", "1234", 19970906),
				new Member("전선유", "qwer", "9874", 19980120),
				new Member("김효정", "zxcv", "4567", 19960723)
		};
		
		for(Member m : members) {
			m.showInfo();
		}
	}	
}
