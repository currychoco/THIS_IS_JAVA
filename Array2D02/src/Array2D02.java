
public class Array2D02 {
	public static void main(String[] args) {
		
		//3�� ��� - 2���� �迭�� �����ϰ� �ٷ� ���� �ʱ�ȭ
		//�����ϰ� �ٷ� �ʱ�ȭ�� �� ���� new int[][]�� ������ �� ����
		/*int[][] a = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};*/
		
		
		//4�� ���
		//2���� �迭�� �������� ����� �ʱ�ȭ�� �и��� ���� �ݵ�� new int[][]�� �����
		int[][] a;
		a = new int[][]{
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}
