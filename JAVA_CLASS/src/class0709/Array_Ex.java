package class0709;

public class Array_Ex {

	public static void main(String[] args) {

		// String 타입 배열 선언하여 같은줄 4명 이름 저장하고 출력
		int i = 0;
		String str[] = { "권순범", "김태광", "이우재", "조시우" };
		
		for (i = 0; i < str.length; i++) { // str.length = 4
			System.out.println(str[i]); // i = 0,1,2,3
		}
		
		int number3[];
		number3 = new int[3];
		
		int number4[] = new int[3];
		System.out.println(number4.length);
		
		for(i=0;i<number4.length;i++) {
			System.out.println(number4[i]);
		}
		
	}

}
