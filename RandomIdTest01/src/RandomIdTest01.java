
class RandomId{
	private static int count;
	private int id;
	
	//Ŭ���� �ʱ�ȭ ��, ���� �ʱ�ȭ ��, Ŭ���� �ʱ���, ���� �ʱ���
	//count�� ���� 0, 100, 200, 300, 400 ... 900
	
	static {
		count = (int)(Math.random() * 10) * 100;
	}
	
	/*
	{
		count = (int)(Math.random() * 10) * 100;
	}
	*/
	
	public RandomId() {
		id = ++count;
	}
	
	public int getId() {
		return id;
	}
}

public class RandomIdTest01 {
	public static void main(String[] args) {
		RandomId r1 = new RandomId();
		RandomId r2 = new RandomId();
		RandomId r3 = new RandomId();
		
		System.out.println(r1.getId());
		System.out.println(r2.getId());
		System.out.println(r3.getId());
		
	}
}
