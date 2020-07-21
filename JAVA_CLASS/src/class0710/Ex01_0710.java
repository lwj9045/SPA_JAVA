package class0710;
import java.util.*;
public class Ex01_0710 {

	public static void main(String[] args) {
		// 5개 입력 
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		int user_num = 0,max = 0, i = 0;
		
		
		for(i=0; i<num.length; i++) { // i = 1,2,3,4
			user_num = scan.nextInt();
			num[i] = user_num;
			
			if(num[i] > max) {  
				max = num[i];
			}

		}
		System.out.println("max 값은 : "+max);
	}

}
