package member;

public class Member {
	
	private int no;
	private int age;
	private String name;
	
	public Member(int no, String name, int age) {
		this.no = no;
		this.age = age;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "회원번호, " + no + ", 회원이름: " + name + ", 회원나이: " + age;
	}
}
