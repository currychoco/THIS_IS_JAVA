package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet p1 = new Pet("����", "�쿵��");
		p1.introduce();
		System.out.println();
		
		RobotPet p2 = new RobotPet("r2d2", "�ּ���");
		p2.introduce();
		System.out.println();
		
		//�������� �����ϴ� ����
		Pet p3 = p2; //���� ���ε� - �θ��� ���������� �ڽ��� �ν��Ͻ��� �����Ͽ���, ��ü�� ������ ����� �� ����
		p3.introduce();
				
	}
}
