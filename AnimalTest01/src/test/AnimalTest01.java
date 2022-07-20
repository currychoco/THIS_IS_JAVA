package test;

import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
	
		//������ ����
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("����ö", "ġ�Ϳ�");
		animals[1] = new Cat("�����", 19);
		animals[2] = new Dog("�����", "���޶�Ͼ�");
		animals[3] = new Cat("��ö��", 3);
		
		//��� ��� 1
		for(int i = 0; i < animals.length; i++) {
			animals[i].bark();
			System.out.println(animals[i]);
			System.out.println();
		}
		
		//��� ��� 2
		for(Animal a : animals) {
			a.bark();
			System.out.println(a);
			System.out.println();
		}
	}
}
