package class0708;
import java.util.*;
public class Ex9_0708 {

	public static void main(String[] args) {
		// 2000���ͱ��� �⺻��� 900��, 2000���� �ʰ� �� 200���ʹ� 100���߰�
		Scanner scan = new Scanner(System.in);
		int dis = 0, pay1 = 0, pay2 = 0, i = 0, sum = 0;
		pay1 = 900;
		System.out.print("�Ÿ��� �Է��ϼ��� : ");
		dis = scan.nextInt();
		
		if(dis/200 <11) {
			
			System.out.println("����� "+pay1+"�� �Դϴ�. ");
		}else {
			pay2 = ((dis/200)-10)*100;
			sum = pay1+pay2;
			System.out.println("����� "+sum+"�� �Դϴ�. ");
		}
		
		
		
		
		
		
	}

}
