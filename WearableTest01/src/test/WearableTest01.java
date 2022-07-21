package test;

import wearable.*;

//1. Wearable �������̽��� �����ϴ� WearableComputerŬ������ �����Ͻÿ�
//2. WearableComputer Ŭ�������� ��ǻ�� �̸��� �ν��Ͻ� ������ �߰��Ͽ� �ϼ��Ͻÿ�
//3. Wearable, Color �������̽��� ��� �����ϴ� WearableRobotŬ������ �����Ͻÿ�
//4. WearableRobot Ŭ�������� ����(color)�� �ν��Ͻ� ������ �߰��Ͽ� �ϼ��Ͻÿ�
//5. main �޼ҵ忡���� WearableComputer, WearableRobot Ŭ������ �ν��Ͻ��� �� �� ����
//	�迭�� ��� �������� �����Ͽ� ����Ͻÿ�

public class WearableTest01 {
	public static void main(String[] args) {
	
		Wearable[] wear = {
				new WearableComputer("����ö"),
				new WearableRobot(Color.RED),
				new WearableComputer("��ö��"),
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
