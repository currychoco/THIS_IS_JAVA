/*
 
 <while문이 필요한 경우>
 - 반복문의 반복횟수를 파악하기 어렵고, 조건식이 중심이 될 때 while문을 사용하면 효율적이 됨
 
 */


//while문의 활용
//문제1) 1부터 1씩 증가하고 그 수를 누적하여 합이 100이 되기 전까지 출력하는 작성하시오
public class While03 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(sum + i < 100) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합은 %d\n", i, sum);
			i++;
		}
		
	}

}
