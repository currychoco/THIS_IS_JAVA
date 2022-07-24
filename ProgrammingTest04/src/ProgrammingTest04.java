
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
		return "이름(" + name + "), 성별(" + gender + ")";
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
		return super.toString() + ", 학번(" + sno + ")";
	}
	
}

public class ProgrammingTest04 {
	public static void main(String[] args) {
		
		People[] p = {
				new People("우영우", "여성"),
				new Student("이준호", "남성", 221001),
				new People("권민우", "남성"),
				new Student("최수연", "여성", 221002)
		};
		for(People a : p) {
			System.out.println(a);
		}
	}
}
