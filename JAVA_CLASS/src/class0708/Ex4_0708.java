package class0708;
import java.util.*;
public class Ex4_0708 {

	public static void main(String[] args) {
		// 1~10까지 랜덤변수 발생, 3번안에 못맞추면 종료
		Scanner scan = new Scanner(System.in);
		
		int ran_num = 0, i = 0, user_num = 0;
		ran_num = (int)(Math.random()*10)+1;
		
		while(i<3) {
			
			user_num = scan.nextInt();
			i++;
			
			if(user_num == ran_num) {
				System.out.println("정답입니다. ");
				i=3;
			}
			
		}System.out.println("종료합니다.");
		
		

	}

}
