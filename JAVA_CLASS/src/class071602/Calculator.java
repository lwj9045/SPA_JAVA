package class071602;

public class Calculator {
	boolean run = true;
	//�ܼ� ��¹�
	void print1() {
		System.out.println("-----------------------------------");
		System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.���� |");
		System.out.println("-----------------------------------");
		System.out.print("���� > ");
	}
	// ����
	void sum(int x, int y) {
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);

	}
	// ����
	void sub(int x, int y) {
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);

	}
	// ����
	void mul(int x, int y) {
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);

	}
	// ������
	void div(int x, int y) {
		double div = x / y;
		System.out.println(x + " / " + y + " = " + div);

	}
	// ����,����
	void run() {
		System.out.println("�����մϴ�. ");
		run = false;
	}

}
