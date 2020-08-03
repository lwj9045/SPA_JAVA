package class072304;

public class StringMethod {

	public static void main(String[] args) {
		// String으로 저장되어 있는 값을 정수로 변환
		
		String str = "33";
		int num = 100;
		int result = 0; 
		
		int num1 = Integer.parseInt(str);
		result = num+num1;
		System.out.println(result);
		
	}

}
