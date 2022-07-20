package test;

import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
	
		//다형성 구현
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("곽두철", "치와와");
		animals[1] = new Cat("김덕배", 19);
		animals[2] = new Dog("이춘삼", "포메라니안");
		animals[3] = new Cat("윤철중", 3);
		
		//출력 방법 1
		for(int i = 0; i < animals.length; i++) {
			animals[i].bark();
			System.out.println(animals[i]);
			System.out.println();
		}
		
		//출력 방법 2
		for(Animal a : animals) {
			a.bark();
			System.out.println(a);
			System.out.println();
		}
	}
}
