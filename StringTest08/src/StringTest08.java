
public class StringTest08 {
	public static void main(String[] args) {
		// 16. split(seperator): �����ڸ� �������� ���ڿ��� �߶� ���ڿ��� �迭�� ���� 
		// �޸�(������, seperater)�� �������� �ܾ �и�
		String words = "lion,tiger,bear,hyena,eagle,monkey,elephant";
		String[] animals = words.split(",");
		
		//��� 1
		for(int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
		for(String s : animals) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("----------");
		
		// 17. substring(): ���ڿ����� Ư�� ���ڿ��� �����Ͽ� ����
		String s1 = "Hello Java World!";
		String s2 = s1.substring(6, 10); //6������ 10�� �ձ���
		System.out.println(s2);
		String s3 = s1.substring(0, 5); // 0������ 5�� �ձ���
		System.out.println(s3);
		String s4 = s1.substring(11, 17); //11������ 17�� �ձ���
		System.out.println(s4);
		String s5 = s1.substring(11); //11������ ������
		System.out.println(s5);
	}
}
