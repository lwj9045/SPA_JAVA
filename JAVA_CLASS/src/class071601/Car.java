package class071601;

public class Car {
	int gas;

	// 생성자 선언
	Car(int gas) { // int gas는 매개변수
		this.gas = gas;
	}

	void setGas(int gas) { // 메소드 선언
		this.gas = gas;
	}

	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다. ");
			return true;
		}
	}

	void run() {
		boolean run = true;
		while (run) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				run = false;
			}
		}
	}

}
