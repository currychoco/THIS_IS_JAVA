

/*
93, 93, 92
85, 85, 86
71, 71, 72
68, 68, 67
83, 93, 92
 
 */
public class Array2D03 {
	public static void main(String[] args) {
		
		int[][] scores = {
				{93, 93, 92, 0},
				{85, 85, 86, 0},
				{71, 71, 72, 0},
				{68, 68, 67, 0},
				{83, 93, 92, 0}
		};
		double[] ave = new double[5];
		
		/*
		int sum = 0, count = 0;
		double ave = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum = 0;
			count = 0;
			for(int j = 0; j < scores[i].length; j++) {
				if(j == scores[i].length-1) {
					scores[i][j] = sum;
					System.out.println((i+1)+"��° �л��� ����: " + scores[i][j]);
					break;
				}
				if(count==0) {
					System.out.println((i+1)+"��° �л��� ���� ����: " + scores[i][j]);
				}else if(count==1) {
					System.out.println((i+1)+"��° �л��� ���� ����: " + scores[i][j]);
				}else if(count==2) {
					System.out.println((i+1)+"��° �л��� ���� ����: " + scores[i][j]);
				}
				++count;
				sum += scores[i][j];
			}
			
			ave = (double)sum / scores[i].length;
			System.out.printf("%d��° �л��� ���: %.2f\n", (i+1), ave);
			System.out.println();
		}
		*/
		
		//����� ���
		for (int i =0; i <scores.length; i++) {
			for(int j =0; j<scores[i].length-1; j++) {
				scores[i][3] += scores[i][j];
			}
			ave[i] = scores[i][3] / 3.0;
		}
		
		System.out.println("  ��ȣ | ���� | ����   | ����   | ����  |  ���    |");
		System.out.println("=====================================");
		for(int i=0;i<scores.length;i++) {
			System.out.printf(" %d��  |", i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%3d | ", scores[i][j]);
			}
			System.out.printf("%.2f |\n", ave[i]);
		}
		
	}
}
