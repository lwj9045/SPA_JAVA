package class071601;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car(5);
		System.out.println("������ �������ּ��� : ");

		int gas = scan.nextInt();
		car.setGas(gas);

		car.setGas(5);
		boolean gasState = car.isLeftgas();
		System.out.println("���� ������ : " + car.gas);
		if (gasState) {
			System.out.println("���");
			car.run();
		}

	}

}
