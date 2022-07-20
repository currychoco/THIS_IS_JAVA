package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet p1 = new Pet("나비", "우영우");
		p1.introduce();
		System.out.println();
		
		RobotPet p2 = new RobotPet("r2d2", "최수연");
		p2.introduce();
		System.out.println();
		
		//다형성을 구현하는 원리
		Pet p3 = p2; //동적 바인딩 - 부모의 참조변수가 자식의 인스턴스를 참조하여도, 실체의 정보를 출력할 수 있음
		p3.introduce();
				
	}
}
