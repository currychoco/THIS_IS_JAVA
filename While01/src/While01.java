/*
 <�ݺ���>
 -loop��
 -while, do-while, for
 -�ݺ����� �ʱⰪ ,���ǽ�, �������� ������� ��
 -�ݺ����� �ݺ�Ƚ���� �ľ��Ͽ��� ��
 
 1. while
 �⺻ ����
 
 �ʱⰪ
 while(���ǽ�){
 	���๮;
 	...
 	������;
 }

 */

public class While01 {

	public static void main(String[] args) {
		
		/*
		//1��
		int i = 1; //�ʱⰪ
		
		while(i <= 10) {//���ǽ�
			System.out.println(i + " Little Indian.");//���๮
			i++; // ������
		}
		*/
		
		
		//2��- 10���� 1���� �ݺ�
		/*
		int i = 10; //�ʱⰪ
		
		while(i >= 1) {//���ǽ�
			System.out.println(i + " Little Indian.");//���๮
			i--; // ����
		}
		*/
		
		//3�� - 1���� 10���� 2�� �����ϸ鼭 �ݺ�
		int i = 1; //�ʱⰪ
		
		while(i <= 10) {//���ǽ�
			System.out.println(i + " Little Indian.");//���๮
			i += 2; // ������
		}
		
	}
		
}
