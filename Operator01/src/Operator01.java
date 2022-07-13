/*

 ������(operator)-<�������� ��ɿ� ���� �з�>
 1. ��� ������: + , -, *, /(��), %(������)
 - *, /, %�� +, -���� �켱������ ����
 
 2. ���� ������: ++(����), --(����), �ڽ��� ���� 1���� �Ǵ� 1�����ϴ� ������ 
 - ��ġ�� ����: ���� ���� ������, ���� ���� ������ 
 - ������ ���� ������ ���� ���� 1���� Ȥ�� ���ҽ�Ű�� ����(����)
 - ������ ���� ���� ����(����)�ϰ� �ڽ��� ���� 1���� �Ǵ� ���� 
 
 3. �� ������: >, >=, <, <=, ==, !=, instanceof
 - �� ������ ����� �׻� true, false �� ���� �ϳ�
 - >, >=,<, <=�� ==, !=���� �켱������ ����
 
 4. �� ������: &&(�� AND, ����), ||(�� OR, ���� ), !(�� NOT, ������)
 - �� ������ ����� �׻� true, false �� ���� �ϳ�
 - �� �����ڿ� �Բ� ���� ����� 
 - &&: �� ���� ���� ��� true�� �� ��ü �ܷΰ��� true�� ��
 - ||: �� ���� �� �߿��� �ϳ��� true��� ��ü ����� true�� ��
 - ! : true�� false��, false�� true�� 
 - &&�� ||���� �켱������ ����
 
 */
public class Operator01 {

	public static void main(String[] args) {

		// 1. ��� ������
		System.out.println(3 + 5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3);
		System.out.println(10 % 3);

		// 2. ���� ������
		int a = 10, b;

		b = a--;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// 3. �� ������
		int c = 10, d = 20;
		System.out.println(c > d);
		System.out.println(c < d);
		System.out.println(c == d);
		System.out.println(c != d);
		System.out.println(c = d);

		// 4. �� ������
		//�� �����ڰ� �� �����ں��� �켱���� ����
		int e = 10, f = 20, g = 30, h = 40;
		System.out.println(e < f && g < h);
		System.out.println(e < f && g > h);	
		System.out.println(e > f && g > h);
		
		System.out.println(e < f || g < h);
		System.out.println(e < f || g > h);	
		System.out.println(e > f || g > h);
		
		System.out.println(!(e < f));


	}
	
}
