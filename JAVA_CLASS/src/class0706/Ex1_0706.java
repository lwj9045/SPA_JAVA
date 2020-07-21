package class0706;

public class Ex1_0706 {

	public static void main(String[] args) {
	
		int num = 0, sum = 0;
		
		for(num = 1; num <= 100; num++) {
			if(num%2 != 0) {
				sum +=num;
			
			}
		}
		System.out.println("1~100까지의 수 중 2의 배수를 제외한 값의 합은 " + sum);
	}

}
