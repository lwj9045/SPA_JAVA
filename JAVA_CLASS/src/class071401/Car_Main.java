package class071401;

import class0714.Ex01_0714;

public class Car_Main {

	public static void main(String[] args) {
//		 Car Ŭ������ ��ü�� �����Ͽ� 
//		 Car Ŭ������ ������ �ִ� �ʵ� ���
//		* ��ü ���� ���
//		 '��ü�θ���Ŭ�����̸�' ������ = new '��üŬ������ ����������';

//		Car Ŭ������ ��ü�� car1�̶�� �̸����� ����
//		car1 : Car Ŭ���� Ÿ���� ����
		Car car1 = new Car();
//		Car Ŭ������ �������ִ� color �ʵ忡 �� �Է�
		car1.color = "red";
//		car1�� color �ʵ尡 ������ �ִ� �� ���
		System.out.println(car1.color);

		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);

		
		String var = "";
		var = car1.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		
//		�Ű������� �ִ� �����ڸ� Ȱ���� ��ü���� 
		Car car4 = new Car("�����ٶ�");
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.ok);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		Ex01_0714 car5 = new Ex01_0714();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
