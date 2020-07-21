package class0710;
import java.util.*;
public class Ex02_0710 {

	public static void main(String[] args) {
		// 첫째줄에 정수 갯수 주어짐, 둘째줄에 수 입력, 최댓값 최소값 출력
		Scanner scan = new Scanner(System.in);
		
		int num2 = 0, user_num = 0, max = 0, min = 1000000;
		
		num2 = scan.nextInt();
		int num1[] = new int[num2];
		
		for(int i=0; i<num1.length; i++) {
			user_num = scan.nextInt();
			num1[i] = user_num;
			
			if(num1[i]>=max) {
				max = num1[i];
			}
			if(num1[i]<=min) {
				min = num1[i];
			}
			
		}
		System.out.print("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
