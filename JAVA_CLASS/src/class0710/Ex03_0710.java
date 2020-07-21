package class0710;
import java.util.*;
public class Ex03_0710 {

	public static void main(String[] args) {
		// 9개의 정수 입력, 최대값 출력, 몇번째 수 인지 출력
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
		System.out.println("최대값 : "+max);
		System.out.println(count);
		
		
		
		
		
	}

}
