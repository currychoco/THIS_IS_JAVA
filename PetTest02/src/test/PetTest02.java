package test;

import pet.Pet;
import pet.RobotPet;

//������ ���� ����
//�θ� Ÿ���� �迭�� �����, �θ�� �ڽ��� �Ѳ����� ��Ƽ� �ϰ� ó����

public class PetTest02 {
	public static void main(String[] args) {
		//�ν��Ͻ� �迭 1
		/*
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("����", "�쿵��");
		pets[1] = new RobotPet("mark", "����ȣ");
		pets[2] = new Pet ("����", "�ּ���");
		pets[3] = new RobotPet("jesi", "����");
		*/
		
		
		Pet[] pets = {
				new Pet("����", "�쿵��"), new RobotPet("mark", "����ȣ"),
				new Pet ("����", "�ּ���"), new RobotPet("jesi", "����")
		};
		
		//��� 
		/*
		for(int i = 0; i < pets.length; i++) {
			pets[i].introduce();
			if(pets[i] instanceof RobotPet) {//pets[i]�� RobotPet�� �����Ѵٸ�, pets[i]�� RobotPet���� �ν��Ͻ���� true
				((RobotPet)pets[i]).work(1);
			}		
			System.out.println();
		}
		*/

		
		//��� 2
		for(Pet p : pets) {
			p.introduce();
			if(p instanceof RobotPet) {
				((RobotPet)p).work(2);
			}
			System.out.println();
		}
	}
}
