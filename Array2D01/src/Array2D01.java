
//2���� �迭�� �⺻

public class Array2D01 {
	public static void main(String[] args) {
		//1�� ��� - �� ���� ���� ������ �ٸ� �� ��� ����
		/*
		int[][] a;		//int���� 2���� �迭�� �����ϴ� ��������a ����
		
		a = new int[3][4]; //���� 3��
		a[0]= new int[4]; //
		a[1]= new int[4];
		a[2]= new int[4];
		
		//2���� �迭�� �� ����
		a[0][1] = 10;
		a[1][2] = 20;
		a[2][3] = 30;
		*/
		
		//2�� ��� - �� ���� ���� ������ ������ �� ���
		int[][] a = new int[3][4];
		
		
		
		
		//2���� �迭�� ���
		for(int i = 0; i < a.length; i++) { // a.length: ���� ����
			for(int j = 0; j < a[i].length; j++) { // a[i].length: �� �࿡ ���� ���� ����
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

}
