package class072303;

public class TryCatch_02 {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0;
		
		try {
		int result = num1/num2;
		System.out.println(result);
		
		}catch(Exception e) {
			System.out.println("계산할 수 없습니다.");
//			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
	}

}
