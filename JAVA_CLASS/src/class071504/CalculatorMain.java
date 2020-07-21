package class071504;

public class CalculatorMain {

	public static void main(String[] args) {

//		Calculator cal = new Calculator();
//		cal.sum(7, 5);
		
//		int val1 = 10;
//		int val2 = 20;
//		cal.sum(val1, val2);
		
		Calculator cal2 = new Calculator();
		cal2.sum1(5, 3);		
		
		System.out.println(cal2.sum1(5, 3));
		
		int result = cal2.sum1(7, 10);
		System.out.println(result);
	}

}
