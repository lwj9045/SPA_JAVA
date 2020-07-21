package class0713;

public class Ex04_Array2D {

	public static void main(String[] args) {
		// 2차원 배열
		
		int num1[][] = new int[2][3]; //2행 3열 정수형 배열
		
		int num2[][] = new int[3][3]; // 3행 3열
		
		int num3[][] = {{1,2,3},{4,5,6}}; // 1행에 1,2,3 2행에 4,5,6 대입
		
//		System.out.println(num1.length);
//		System.out.println(num1[0].length);
		
		for(int i = 0; i<num3.length; i++) { // 2행 
			for(int j = 0; j<num3[0].length; j++) {  // 3열
				System.out.println(i+","+j+": "+num3[i][j]);
				
				
			}
		}
		
		String str [][] = {{"가","나","다"},{"라","마","바"},{"사","아","자"}};
		
		
	}

}
