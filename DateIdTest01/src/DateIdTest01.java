import java.util.Calendar;

class DateId{
	private static long count;
	private long id;
	
	//Ŭ���� �ʱ�ȭ ��, Ŭ���� �ʱ���
	//��¥�� ����Ͽ� 1�� �����ϴ� ������ �ĺ���ȣ�� �����ϴ� ���
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1; //month�� ���� 0~11�� �����Ǿ� ����
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
