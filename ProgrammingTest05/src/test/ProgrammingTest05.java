package test;
import car.*;

public class ProgrammingTest05 {
	public static void main(String[] args) {
		Car[] cars = {
				new Sedan("그랜져"),
				new SUV("펠리세이드"),
				new Truck("봉고"),
				new SuperCar("페라리")
		};
		
		for (Car c : cars) {
			c.run();
			c.stop();
			if (c instanceof Sedan) {
				((Sedan) c).sound();
				System.out.println();
			}
			if (c instanceof SUV) {
				((SUV) c).safe();
				System.out.println();
			}
			if (c instanceof Truck) {
				((Truck) c).load();
				System.out.println();
			}
			if (c instanceof Skinnable) {
				((SuperCar) c).turbo();
				((SuperCar) c).changeSkin(Skinnable.RED);
			}
		}
	}
}
