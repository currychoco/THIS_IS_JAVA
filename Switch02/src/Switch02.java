import java.util.Scanner;

//switch~case문 특징 -if문에 비해 활용에 제약은 있지만,
//	가짓수가 여러가지이고, 정수 또는 문자열로 딱 떨어지는 값을 가지는 조건일 때는 코드의 가독성이 높아짐
//switch~case문 활용
//문제1) 자신의 태어난 월을 입력하여, 탄생화를 출력하시오
public class Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 월 입력: ");
		int month = sc.nextInt();
		String flower = "";
		
		
		if(month>0 && month<13) {
			switch(month) {
			case 1:
				flower = "카네이션";
				break;
			case 2:
				flower = "물망초";
				break;
			case 3:
				flower = "벚꽃";
				break;
			case 4:
				flower = "아네모네";
				break;
			case 5:
				flower = "튤립";
				break;
			case 6:
				flower = "장미";
				break;
			case 7:
				flower = "해바라기";
				break;
			case 8:
				flower = "양귀비";
				break;
			case 9:
				flower = "다알리아";
				break;
			case 10:
				flower = "소국";
				break;
			case 11:
				flower = "금잔화";
				break;
			case 12:
				flower = "동백꽃";
				break;
			}
			System.out.println("당신이 태어난 " + month + "월의 탄생화는 " + flower + "입니다.");
		} else {
			System.out.println("1 ~ 12사이의 정수를 입력하시오");
		}
		
		sc.close();		
	}

}
