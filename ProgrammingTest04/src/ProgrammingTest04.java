
class People{
	private String name;
	private String gender;
	
	public People(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "�̸�(" + name + "), ����(" + gender + ")";
	}
}

class Student extends People{
	private int sno;
	
	public Student(String name, String gender, int sno) {
		super(name, gender);
		this.sno = sno;
	}
	
	//getter
	public int getSno() {
		return sno;
	}
	//setter
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return super.toString() + ", �й�(" + sno + ")";
	}
	
}

public class ProgrammingTest04 {
	public static void main(String[] args) {
		
		People[] p = {
				new People("�쿵��", "����"),
				new Student("����ȣ", "����", 221001),
				new People("�ǹο�", "����"),
				new Student("�ּ���", "����", 221002)
		};
		for(People a : p) {
			System.out.println(a);
		}
	}
}
