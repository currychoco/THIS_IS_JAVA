import java.util.Scanner;

//문제1) 정수 1개를 입력하여, 1부터 입력한 수까지 중에서 홀수를 출력하고, 그 홀수의 합과 갯수를 입력하시오
//문제2) 정수 1개를 입력하여, 1부터 입력한 수까지 1씩 증가하여 그 중에서 3의 배수이면서 4의 배수인 수를 출력하고, 그 수의 합계와 갯수를 찰력하시오
public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력화면
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int sum = 0, count = 0;
		
		
		/*
		//1번문제
		//for문으로
		for(int i = 1; i <= n; i++) {
			
			if(i%2 == 1) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
			
		}
				
		//while문으로
		int i = 1;
		while(i <= n) {
			if(i%2 == 1) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
			i++;
		}	
		
		//do-while문으로
		int i = 1;
		do {
			if(i % 2 == 1) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
			i++;
		}while(i <= n);
		*/
		
		
		/*	
		for(int i = 1; i <= n; i++) {	
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
		}
		
		int i = 1;
		while(i <= n) {
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
			i++;
		}
		*/
		int i = 1;
		do {
			if(i%3==0 && i%4==0) {
				++count;
				sum += i;
				System.out.printf("수: %-3d  합: %-3d  갯수: %-3d\n", i, sum, count);
			}
			i++;
		}while(i <= n);
		
		sc.close();
	}
}
