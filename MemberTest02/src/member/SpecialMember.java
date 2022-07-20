package member;

public class SpecialMember extends Member{
	
	private String privilege;

	public SpecialMember(int no, String name, int age, String privilege) {
		super(no, name, age);
		this.privilege = privilege;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	//@: Annotation, 자바 컴파일러에게 알려주는 일종의 주석
	//@Override: 이 메소드는 오버라이딩 하는 메소드임을 알려줌. 오버라이딩을 잘못한 경우 에러표시를 함
	@Override
	public String toString() {
		return super.toString() + ", 특별혜택(" + privilege + ")";
	}
	
}
