
/*
 XYŬ����
 1. �ν��Ͻ� ����: ��ǥ ���� x, y, �ĺ���ȣ - ���� id
 2. Ŭ���� ����: �ĺ���ȣ�� �ڵ� ���� ���� count
 3. �����ڸ� ���ؼ� x, y ��ǥ���� �����ϵ��� �� - x, y ��ǥ�� ���� �־����� �ʾ��� ��, x�� ���� �־����� ��,
  x, y ��ǥ�� ���� ��� �־����� ��, �ν��Ͻ��� �����Ͽ� �����ϵ��� �ϴ� ���� ��� �����ϵ��� �����ڸ� �����ε��Ͻÿ�
 4. Ŭ���� ������ Ȱ���Ͽ� �ڵ����� �����ϴ� �ĺ���ȣ�� ����ϵ��� �����Ͻÿ�
 5. ��ǥ���� ����ϴ� �޼ҵ带 �����Ͻÿ�. ��ǥ���� ���´� No. 1 : (10, 20)
 6. ���� �޼��忡�� ������ �����ڸ� Ȱ���ϴ� �ν��Ͻ��� �����ϰ�, ��ǥ���� ����ϵ��� �Ͻÿ�
 */
class XY{
	private static int count = 0;
	private int x = 0;
	private int y = 0;
	private int id = 0;
	
	/*
	 �ν��Ͻ� �ʱ�ȭ ��, ������ �ʱ�ȭ ��, �ν��Ͻ� �ʱ���, ������ �ʱ���
	 ���۽���: �������� ȣ�� ������ ����
	 ������: ��� �����ڿ��� ���������� �ؾ��� ���� �����ϰ��� �� �� ���
	{
		id = ++count;
	}
	*/
	
	public XY() {
		++count;
		id = count;
	}
	public XY(int x) {
		this();
		this.x = x;
	}
	public XY(int x, int y) {
		this(x);
		this.y = y;
	}
	public XY(XY xy) {
		this(xy.x, xy.y);
	}
	
	public static void showCount() {
		System.out.println("��ǥ ���� ����: " + count);
	}
	
	public String toString() {
		return "No " + id + " : (" + x + ", "+  y +")";
	}
	
}

public class XYTest01 {
	public static void main(String[] args) {
		XY xy1 = new XY();
		XY xy2 = new XY(10);
		XY xy3 = new XY(100, 200);
		XY xy4 = new XY(xy3);
		
		System.out.println(xy1.toString());
		System.out.println(xy2.toString());
		System.out.println(xy3.toString());
		System.out.println(xy4.toString());
		
		XY.showCount(); 
		
	}
}
