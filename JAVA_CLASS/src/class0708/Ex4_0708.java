package class0708;
import java.util.*;
public class Ex4_0708 {

	public static void main(String[] args) {
		// 1~10���� �������� �߻�, 3���ȿ� �����߸� ����
		Scanner scan = new Scanner(System.in);
		
		int ran_num = 0, i = 0, user_num = 0;
		ran_num = (int)(Math.random()*10)+1;
		
		while(i<3) {
			
			user_num = scan.nextInt();
			i++;
			
			if(user_num == ran_num) {
				System.out.println("�����Դϴ�. ");
				i=3;
			}
			
		}System.out.println("�����մϴ�.");
		
		

	}

}
