package class071602;

public class Calculator2 {
	boolean run = true;
	int user_num,x,y;
	
	void print1() {	//�ܼ� ��¹�
		System.out.println("-----------------------------------");
		System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.���� |");
		System.out.println("-----------------------------------");
		System.out.print("���� > ");
	}
	
	void user_num(int user_num) {	// �ʵ� user_num�� �� ���� 
		this.user_num = user_num;
	}
	void num1(int num1) {	// �ʵ� num1�� �� ����
		this.x = num1;
	}
	void num2(int num2) {	// �ʵ� num2�� �� ����
		this.y = num2;
	}
	void sum() {	// ����
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}
	void sub() {	// ����
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);
	}
	
	void mul() {	// ����
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);
	}
	
	void div() {	// ������
		double div = x / y;
		System.out.println(x + " / " + y + " = " + div);
	}
	
	void runOut() {	// ����,����
		System.out.println("�����մϴ�. ");
		run = false;
	}
	//if 1234 �϶� ����, 5�϶� �����ϴ� �޼ҵ�
//	void ifRun() {
//		if(user_num !=5) {
//			System.out.println("�����Է� 1 : ");
//			System.out.println("�����Է� 2 : ");
//		}
//	}
	
	void switchRun() {
		switch(user_num) {
		case 1 :
			sum();
			break;
		case 2 :
			sub();
			break;
		case 3 :
			mul();
			break;
		case 4 :
			div();
			break;
		}
		
	}
}