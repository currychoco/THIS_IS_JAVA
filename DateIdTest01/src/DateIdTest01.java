import java.util.Calendar;

class DateId{
	private static long count;
	private long id;
	
	//클래스 초기화 블럭, 클래스 초기자
	//날짜를 사용하여 1씩 증가하는 유일한 식별번호를 생성하는 방법
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1; //month의 값은 0~11로 설정되어 있음
		long date = c.get(Calendar.DATE);
		count = year*10000000 + month*100000 + date*1000;
	}
	
	public DateId() {
		id = ++count;
	}
	
	public long getId() {
		return id;
	}
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId d1 = new DateId();
		DateId d2 = new DateId();
		DateId d3 = new DateId();
		
		System.out.println("d1 : " + d1.getId());
		System.out.println("d2 : " + d2.getId());
		System.out.println("d2 : " + d3.getId());
	}
}
