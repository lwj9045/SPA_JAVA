package class0708;
import java.util.*;
public class Ex9_0708 {

	public static void main(String[] args) {
		// 2000미터까지 기본요금 900원, 2000미터 초과 시 200미터당 100원추가
		Scanner scan = new Scanner(System.in);
		int dis = 0, pay1 = 0, pay2 = 0, i = 0, sum = 0;
		pay1 = 900;
		System.out.print("거리를 입력하세요 : ");
		dis = scan.nextInt();
		
		if(dis/200 <11) {
			
			System.out.println("요금은 "+pay1+"원 입니다. ");
		}else {
			pay2 = ((dis/200)-10)*100;
			sum = pay1+pay2;
			System.out.println("요금은 "+sum+"원 입니다. ");
		}
		
		
		
		
		
		
	}

}
