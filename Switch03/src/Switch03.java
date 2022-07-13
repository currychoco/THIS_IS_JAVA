import java.util.Scanner;

//문제1) 월을 입력하여, 계절을 판별하시오
// 3, 4, 5 봄 / 6, 7, 8 여름 / 9, 10 ,11 가을/ 12, 1, 2 겨울
//출력예시: 7월은 여름입니다
public class Switch03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int month = sc.nextInt();
		String season = "";
		
		System.out.println(month + "월은 " + season + "입니다.");
		
		if(month>0 && month<13) {
			switch(month) {
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			case 12: case 1: case 2:
				season = "겨울";
				break;
			}
			System.out.println(month + "월은 " + season + "입니다.");
		} else {
			System.out.println("1 ~ 12사이의 정수를 입력하시오");
		}
		
		sc.close();
	}

}
