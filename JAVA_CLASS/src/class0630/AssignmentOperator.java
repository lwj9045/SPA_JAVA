package class0630;

public class AssignmentOperator {

	public static void main(String[] args) {
		// 대입연산자
		int num1 = 0, num2 = 0, num3 = 0;
		
		num1 = 5;
		num2 = 3;
		
		System.out.println(num1);// 5
		System.out.println(num2);// 3
		System.out.println(num3);// 0
		
		num3 = num1+=num2;
		System.out.println(num1);// 8
		System.out.println(num2);// 3
		System.out.println(num3);// 8
		
		num3 = num1-=num2;
		System.out.println(num1);// 5
		System.out.println(num2);// 3 
		System.out.println(num3);// 5
		
		num3 = num1*=num2;
		System.out.println(num1);// 15
		System.out.println(num2);// 3
		System.out.println(num3);// 15
		
		num3 = num1/=num2;
		System.out.println(num1);// 5
		System.out.println(num2);// 3
		System.out.println(num3);// 5
		
		num3 = num1%=num2;
		System.out.println(num1);// 2
		System.out.println(num2);// 3
		System.out.println(num3);// 2
		

	}

}
