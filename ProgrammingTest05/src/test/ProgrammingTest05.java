package test;
import car.*;

public class ProgrammingTest05 {
	public static void main(String[] args) {
		Car[] cars = {
				new Sedan("�׷���"),
				new SUV("�縮���̵�"),
				new Truck("����"),
				new SuperCar("���")
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
