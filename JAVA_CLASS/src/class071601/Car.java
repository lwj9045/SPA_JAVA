package class071601;

public class Car {
	int gas;

	// ������ ����
	Car(int gas) { // int gas�� �Ű�����
		this.gas = gas;
	}

	void setGas(int gas) { // �޼ҵ� ����
		this.gas = gas;
	}

	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�. ");
			return true;
		}
	}

	void run() {
		boolean run = true;
		while (run) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�. (gas �ܷ� : " + gas + ")");
				run = false;
			}
		}
	}

}
