package mobile;

public class MobileTest {
	public static void main(String[] args) {
		//객체 생성
		Mobile[] mobiles = {
				new Ltab("Ltab", 500, "ABC-01"),
				new Otab("Otab", 1000, "XYZ-20")
		};
		
		//객체 정보 출력
		printTitle();
		for(Mobile m : mobiles) {
			printMobile(m);
		}
		
		//10분 충전
		for(Mobile m : mobiles) {
			m.charge(10);
		}
		
		//10분 충전 후 출력	
		System.out.println("\n[10분 충전]");
		printTitle();
		for(Mobile m : mobiles) {
			printMobile(m);
		}
		
		//5분 통화
		for(Mobile m : mobiles) {
			m.operate(5);
		}
		
		//5분 통화 후 출력
		System.out.println("\n[5분 통화]");
		printTitle();
		for(Mobile m : mobiles) {
			printMobile(m);
		}
		
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("%4s      %-4d       %6s\n", mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
	}
	public static void printTitle() {
		System.out.println("Mobile    Battery    OS");
		System.out.println("--------------------------------");
	}
}
