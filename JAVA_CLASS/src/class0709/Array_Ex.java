package class0709;

public class Array_Ex {

	public static void main(String[] args) {

		// String Ÿ�� �迭 �����Ͽ� ������ 4�� �̸� �����ϰ� ���
		int i = 0;
		String str[] = { "�Ǽ���", "���±�", "�̿���", "���ÿ�" };
		
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
