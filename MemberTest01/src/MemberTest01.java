
/*
 <회원 클래스>
 1. 클래스명: Member
 2. 멤버변수: 회원번호(no), 회원이름(name), 회원나이(age), private으로 선언
 3. 생성자: 인스턴스를 만들 때 초기화 할 수 있는 생성자, public으로 선언
 4. getter/setter 메소드 생성, public으로 선언
 5. main 메소드에서 Member 클래스에 대한 인슨턴스를 5개 만들어서 그 정보를 출력하시오
*/

class Member{
	
	//멤버변수 -> 필드(field)
	private String no;
	private String name;
	private int age;
	
	//매개변수가 있는 생성자 -> 생성자 오버로딩
	public Member(String no, String name, int age){
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void showInfo() {
		System.out.println("◎회원 정보 출력");
		System.out.println("  회원번호: " + no);
		System.out.println("  회원이름: " + name);
		System.out.println("  회원나이: " + age);
		System.out.println();
	}
}
public class MemberTest01 {
	public static void main(String[] args) {
		
		/*
		//인스턴스 배열
		Member[] members = new Member[5]; //Member형의 배열의 참조변수 members;
		members[0] = new Member("1", "우영우", 27);
		members[1] = new Member("2", "이준호", 29);
		members[2] = new Member("3", "정명석", 43);
		members[3] = new Member("4", "우광호", 52);
		members[4] = new Member("5", "한선영", 50);		
		*/
		
		/*
		//인스턴스 배열 2번
		Member[] members = {
				new Member("1", "우영우", 27),
				new Member("2", "이준호", 29),
				new Member("3", "정명석", 43),
				new Member("4", "우광호", 52),
				new Member("5", "한선영", 50)
		};
		*/
		
		Member[] members;
		members = new Member[]{
				new Member("1", "우영우", 27),
				new Member("2", "이준호", 29),
				new Member("3", "정명석", 43),
				new Member("4", "우광호", 52),
				new Member("5", "한선영", 50)
		};
		
		/*
		Member m1 = new Member("1", "우영우", 27);
		Member m2 = new Member("2", "이준호", 29);
		Member m3 = new Member("3", "정명석", 43);
		Member m4 = new Member("4", "우광호", 52);
		Member m5 = new Member("5", "한선영", 50);
		*/
		
		/*
		for(int i = 0; i < members.length; i++) {
			members[i].showInfo();
		}
		*/
		
		for(Member m: members) {
			m.showInfo();
		}
		
		
		/*
		System.out.println("◎회원 1 정보\n");
		System.out.println("회원id: " + m1.getNo() + "\n회원이름: " + m1.getName() + "\n회원나이: " + m1.getAge());
		
		System.out.println("\n◎회원 2 정보");
		System.out.println("n회원id: " + m2.getNo() + "\n회원이름: " + m2.getName() + "\n회원나이: " + m2.getAge());
		
		System.out.println("\n◎회원 3 정보");
		System.out.println("회원id: " + m3.getNo() + "\n회원이름: " + m3.getName() + "\n회원나이: " + m3.getAge());
		
		System.out.println("\n◎회원 4 정보");
		System.out.println("회원id: " + m4.getNo() + "\n회원이름: " + m4.getName() + "\n회원나이: " + m4.getAge());
		
		System.out.println("\n◎회원 5 정보");
		System.out.println("회원id: " + m5.getNo() + "\n회원이름: " + m5.getName() + "\n회원나이: " + m5.getAge());
		*/
		
		/*
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		m4.showInfo();
		m5.showInfo();
		*/
		
	}
}
