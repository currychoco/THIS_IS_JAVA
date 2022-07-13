import java.util.Scanner;

//문제 1) 월을 입력하여 계절을 판별하시오 (if문으로 작성)
// 3, 4, 5 봄 / 6, 7, 8 여름 / 9, 10 ,11 가을/ 12, 1, 2 겨울

//&&: 이고, 이면서
//||: 이거나, 또는
public class If04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		String season = "";
		
		System.out.print("월을 입력하시오: ");
		month = sc.nextInt();
		
		//1번
		/*
		if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "가을";
		}else {
			season = "겨울";
		}
		*/
		
		
		//2번
		if(month>=3 && month<=5) {
			season = "봄";
		} else if(month>=6 && month<=8) {
			season = "여름";
		} else if(month>=9 && month<=11) {
			season = "가을";
		} else if(month==12 || month<=1&&month>=2) {
			season = "겨울";
		} else {
			season = "없음";
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
		
		sc.close();
		
	}
}
