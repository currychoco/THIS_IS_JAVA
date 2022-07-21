package test;

import wearable.*;

//1. Wearable 인터페이스를 구현하는 WearableComputer클래스를 생성하시오
//2. WearableComputer 클래스에는 컴퓨터 이름을 인스턴스 변수로 추가하여 완성하시오
//3. Wearable, Color 인터페이스를 모두 구현하는 WearableRobot클래스를 생성하시오
//4. WearableRobot 클래스에는 색상(color)을 인스턴스 변수로 추가하여 완성하시오
//5. main 메소드에서는 WearableComputer, WearableRobot 클래스의 인스턴스를 각 두 개씩
//	배열에 담아 다형성을 구현하여 출력하시오

public class WearableTest01 {
	public static void main(String[] args) {
	
		Wearable[] wear = {
				new WearableComputer("곽두철"),
				new WearableRobot(Color.RED),
				new WearableComputer("김철배"),
				new WearableRobot(Color.BLUE)
		};
		
		for(Wearable w : wear) {
			w.putOn();
			w.putOff();
			if(w instanceof Color) {
				System.out.println(w);
			}
			System.out.println();
		}
	}
}
