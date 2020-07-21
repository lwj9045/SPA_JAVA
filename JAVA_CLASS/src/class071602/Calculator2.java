package class071602;

public class Calculator2 {
	boolean run = true;
	int user_num,x,y;
	
	void print1() {	//단순 출력문
		System.out.println("-----------------------------------");
		System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료 |");
		System.out.println("-----------------------------------");
		System.out.print("선택 > ");
	}
	
	void user_num(int user_num) {	// 필드 user_num에 값 저장 
		this.user_num = user_num;
	}
	void num1(int num1) {	// 필드 num1에 값 저장
		this.x = num1;
	}
	void num2(int num2) {	// 필드 num2에 값 저장
		this.y = num2;
	}
	void sum() {	// 덧셈
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}
	void sub() {	// 뺄셈
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);
	}
	
	void mul() {	// 곱셈
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);
	}
	
	void div() {	// 나눗셈
		double div = x / y;
		System.out.println(x + " / " + y + " = " + div);
	}
	
	void runOut() {	// 동작,종료
		System.out.println("종료합니다. ");
		run = false;
	}
	//if 1234 일때 동작, 5일때 종료하는 메소드
//	void ifRun() {
//		if(user_num !=5) {
//			System.out.println("숫자입력 1 : ");
//			System.out.println("숫자입력 2 : ");
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