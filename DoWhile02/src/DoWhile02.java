import java.util.Scanner;

//do-while문의 활용
//메뉴 선택 화면
//1~4번까지 메뉴를 입력하고, 1~4이 아니라면 메뉴화면을 계속 보여주는 프로그램을 작성하시오
public class DoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		//메뉴 선택 화면
		do {
			System.out.println("*** 메뉴선택 ***");
			System.out.println("1번 - 파일 열기");
			System.out.println("2번 - 파일 읽기");
			System.out.println("3번 - 파일 쓰기");
			System.out.println("4번 - 파일 닫기");
			System.out.print("메뉴 입력(1~4): ");
			menu = sc.nextInt();
		//} while(menu<1 || menu>4);
		} while(!(menu>=1 && menu<=4)); // 드 모르간의 법칙
		
		//메뉴에 대한 처리 - switch-case
		switch(menu) {
		case 1:
			System.out.println("파일을 열었습니다.");
			break;
		case 2:
			System.out.println("파일을 읽었습니다.");
			break;
		case 3:
			System.out.println("파일을 썼습니다.");
			break;
		case 4:
			System.out.println("파일을 닫았습니다.");
			break;
		}
		
		
		
		
		
		sc.close();
	}
}
