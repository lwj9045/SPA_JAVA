package class071601;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car(5);
		System.out.println("가스를 주입해주세요 : ");

		int gas = scan.nextInt();
		car.setGas(gas);

		car.setGas(5);
		boolean gasState = car.isLeftgas();
		System.out.println("현재 가스량 : " + car.gas);
		if (gasState) {
			System.out.println("출발");
			car.run();
		}

	}

}
