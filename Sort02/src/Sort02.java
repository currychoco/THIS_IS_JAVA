
public class Sort02 {

	public static void main(String[] args) {
		//int[] a = { 50, 70, 20, 10, 30 };
		
		int[] a = new int[10];
		
		for(int i =0; i<a.length; i++) {
			a[i]=(int)(Math.random()*90+10);
		}
		
		
		
		//�������� ��
		for(int i=0; i<a.length; i++){
			System.out.printf("%3d", a[i]);
		}
		System.out.println();

		//���� ���� - �ٷ� ������ �迭�� ������ ���Ͽ� �����ϴ� ���
		for (int i = 0; i < a.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < (a.length-1) - i; j++) {
				if (a[j] > a[j + 1]) { //�ε�ȣ�� ���� ��������, �������� ����
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					flag = true;
				}
			}
			if(!flag) {//flag == false
				break;
			}
			
			System.out.printf("%d�� ȸ�� ��: ",i+1);
			for(int j=0; j<a.length;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

}
