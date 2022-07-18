import java.util.Scanner;

//Car클래스
//차의 특징: 이름, 크기(너비, 높이, 길이), 이동거리, 연료
// 멤버변수: name, width, height, length, x, y, fuel
//생성자: 멤버변수의 값을 초기화
//멤버메소드: 필요한 필드만 생성
//정보 출력 메소드
class Car{
	//멤버 변수
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	//매개변수를 갖는 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;	
		x = y = 0.0;
	}
	//getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	//setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	//정보 출력 메소드(이름, 너비, 높이, 길이)
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
	}
	
	//거리 이동 메소드
	public boolean isMoved(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy);
		if(fuel >= distance) { //이동 가능 -> 연료량 >= 움직일 거리
			x += dx;
			y += dy;
			fuel -= distance;
			return true;
		}else {//이동 불가능 -> 연료량 < 움직일 거리
			return false;
		}
	}
}

public class CarTest01 {
	public static void main(String[] args) {
		/*
		Car car1 = new Car("아이오닉5", 1500, 1100, 2800, 100);
		Car car2 = new Car("쏘렌토2023", 1600, 1400, 3000, 120);
		
		
		car1.putSpec();
		System.out.println();
		car2.putSpec();
		*/
		
		//2번 차의 제원을 입력하여 인스턴스를 생성하고 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("차의 제원을 입력하시오.");
		System.out.print("차 이름: ");
		String name = sc.next();
		System.out.print("차 너비: ");
		int width = sc.nextInt();
		System.out.print("차 높이: ");
		int height = sc.nextInt();
		System.out.print("차 길이: ");
		int length = sc.nextInt();
		System.out.print("연료량: ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		myCar.putSpec();
		
		//3번 차의 연료량으로 이동거리를 계산하여, 대화식으로 이동하도록 멤버 메소드를 만들고, 반복문을 사용하여 처리하도록 프로그래밍 하시오
		//반복문을 사용하여 처리하도록 프로그래밍하시오
		
		//무한루프: while(true)조건에 집중할 때, for( ; true; ), for(;;)반복 횟수에 집중할 때
		while(true) {
			System.out.println("현재위치: (" + myCar.getX() + ", " + myCar.getY() + "), 남은 연료량: " + myCar.getFuel());
			System.out.print("계속 이동하시겠습니까?(Yes: 1, No: 0): ");
			int yn = sc.nextInt();
			if(yn == 0) {
				break;
			}
			
			System.out.print("x방향 이동거리: ");
			double dx = sc.nextDouble();
			System.out.print("y방향 이동거리: ");
			double dy = sc.nextDouble();
			
			if(!myCar.isMoved(dx, dy)) {
				System.out.println("연료가 부족합니다!");
			}
		}
		System.out.println("차가 정지하였습니다.");
		
		sc.close();
	}
}
