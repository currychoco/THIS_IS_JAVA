

//1���� �迭�� Ȱ��
//����1) 85, 93, 71, 63, 85�� ������ �����ϴ� int���� 1���� �迭scores�� �����ϰ�, �� �л��� ������ ����ϰ�, ������ ����� ����Ͻÿ�
public class Array03 {
	public static void main(String[] args) {
		int[] scores = {85, 93, 71, 63, 85};
		int sum = 0;
		double ave = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println((i + 1) +"�� �л��� ���� : " + scores[i]);
		}
		ave = (double)sum / scores.length;
		
		System.out.println("\n����: " + sum + "\n���: " + ave);
		
	}

}
