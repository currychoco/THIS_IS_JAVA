/*
 
 <while���� �ʿ��� ���>
 - �ݺ����� �ݺ�Ƚ���� �ľ��ϱ� ��ư�, ���ǽ��� �߽��� �� �� while���� ����ϸ� ȿ������ ��
 
 */


//while���� Ȱ��
//����1) 1���� 1�� �����ϰ� �� ���� �����Ͽ� ���� 100�� �Ǳ� ������ ����ϴ� �ۼ��Ͻÿ�
public class While03 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(sum + i < 100) {
			sum += i;
			System.out.printf("1���� %2d������ ���� %d\n", i, sum);
			i++;
		}
		
	}

}
