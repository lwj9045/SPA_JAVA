package class0710;
import java.util.*;
public class Ex03_0710 {

	public static void main(String[] args) {
		// 9���� ���� �Է�, �ִ밪 ���, ���° �� ���� ���
		Scanner scan = new Scanner(System.in);
		int user_num = 0,max = 0, count = 0;
		int num[] = new int[9];
		
		for(int i =0; i<num.length; i++) {
			user_num = scan.nextInt();
			num[i] = user_num;
			
			if(num[i]>=max) {
				max = num[i];
				count = i+1;
			}
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println(count);
		
		
		
		
		
	}

}
