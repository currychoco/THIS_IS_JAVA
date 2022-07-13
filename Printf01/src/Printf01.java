
// printf() �޼ҵ�: formmating, �ڸ����� ���缭 ����ϴ� �޼ҵ�
// %: ���Ĺ���(���Ĺ���)
public class Printf01 {

	public static void main(String[] args) {
		
		// 1. ���� ��� ������
		// %d: ���� ���, decimal(������)
		int a = 34567;
		System.out.printf("%d\n", a);
		System.out.printf("%7d\n", a);
		System.out.printf("%10d\n", a);
		System.out.printf("%-10dHello\n", a);

		// 2. �Ǽ� ������
		// %f: �Ǽ� ����, float
		double b = 3.141592;
		System.out.printf("%f\n", b);
		System.out.printf("%.2f\n", b);
		System.out.printf("%.4f\n", b);
		System.out.printf("%7.2f\n", b);
		System.out.printf("%-7.2f�ڹ�\n", b);
		
		// 3. ���� ������
		// %c: charater
		char c = 'A'; //2����Ʈ
		System.out.printf("%c\n", c);
		System.out.printf("%5c\n", c);
		System.out.printf("%-5c�ڹ�\n", c);
		
		// 4. ���ڿ� ������
		// %s: string
		String s = "hello";
		System.out.printf("%10s\n", s);
		System.out.printf("%-10s�ڹ�\n", s);
		
		// 5. 8���� ���, 16���� ���
		// %o: octal, 8����
		// %x: hexadecimal, 16����
		int x = 9, y = 15;
		System.out.printf("%d %d\n", x, y);
		System.out.printf("%o %o\n", x, y);
		System.out.printf("%x %x\n", x, y);
		System.out.printf("%X %X\n", x, y);
		
		
	}

}
