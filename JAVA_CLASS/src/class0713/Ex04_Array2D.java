package class0713;

public class Ex04_Array2D {

	public static void main(String[] args) {
		// 2���� �迭
		
		int num1[][] = new int[2][3]; //2�� 3�� ������ �迭
		
		int num2[][] = new int[3][3]; // 3�� 3��
		
		int num3[][] = {{1,2,3},{4,5,6}}; // 1�࿡ 1,2,3 2�࿡ 4,5,6 ����
		
//		System.out.println(num1.length);
//		System.out.println(num1[0].length);
		
		for(int i = 0; i<num3.length; i++) { // 2�� 
			for(int j = 0; j<num3[0].length; j++) {  // 3��
				System.out.println(i+","+j+": "+num3[i][j]);
				
				
			}
		}
		
		String str [][] = {{"��","��","��"},{"��","��","��"},{"��","��","��"}};
		
		
	}

}
