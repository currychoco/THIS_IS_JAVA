package test;

import pet.Pet;
import pet.RobotPet;

//다형성 구현 원리
//부모 타입의 배열을 만들고, 부모와 자식을 한꺼번에 담아서 일괄 처리함

public class PetTest02 {
	public static void main(String[] args) {
		//인스턴스 배열 1
		/*
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("나비", "우영우");
		pets[1] = new RobotPet("mark", "이준호");
		pets[2] = new Pet ("별이", "최수연");
		pets[3] = new RobotPet("jesi", "정명석");
		*/
		
		
		Pet[] pets = {
				new Pet("나비", "우영우"), new RobotPet("mark", "이준호"),
				new Pet ("별이", "최수연"), new RobotPet("jesi", "정명석")
		};
		
		//출력 
		/*
		for(int i = 0; i < pets.length; i++) {
			pets[i].introduce();
			if(pets[i] instanceof RobotPet) {//pets[i]가 RobotPet을 참조한다면, pets[i]가 RobotPet형의 인스턴스라면 true
				((RobotPet)pets[i]).work(1);
			}		
			System.out.println();
		}
		*/

		
		//출력 2
		for(Pet p : pets) {
			p.introduce();
			if(p instanceof RobotPet) {
				((RobotPet)p).work(2);
			}
			System.out.println();
		}
	}
}
