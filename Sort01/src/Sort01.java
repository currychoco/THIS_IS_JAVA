
//�������� (Selection Sort) - i�� j�� �����ϸ鼭 �����ϴ� ���
public class Sort01 {

	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30};

		
		//���� ��
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		//��������
		for(int i = 0; i <a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) { //�ε�ȣ�� ���� �������� ������������ ����
					int t =a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.printf("%d�� ȸ�� ��: ",i+1);
			for(int j=0; j<a.length;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//���� ��
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
	}

}
