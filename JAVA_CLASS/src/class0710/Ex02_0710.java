package class0710;
import java.util.*;
public class Ex02_0710 {

	public static void main(String[] args) {
		// ù°�ٿ� ���� ���� �־���, ��°�ٿ� �� �Է�, �ִ� �ּҰ� ���
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
		System.out.print("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
