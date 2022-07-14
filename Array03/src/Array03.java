

//1차원 배열의 활용
//문제1) 85, 93, 71, 63, 85의 점수를 저장하는 int형의 1차원 배열scores를 생성하고, 각 학생의 점수를 출력하고, 총점과 평균을 계산하시오
public class Array03 {
	public static void main(String[] args) {
		int[] scores = {85, 93, 71, 63, 85};
		int sum = 0;
		double ave = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println((i + 1) +"번 학생의 점수 : " + scores[i]);
		}
		ave = (double)sum / scores.length;
		
		System.out.println("\n총점: " + sum + "\n평균: " + ave);
		
	}

}
