package class0630;
import java.util.Scanner;
public class Test0630 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		
		System.out.print("");
		x = scan.nextInt();
		System.out.print("");
		y = scan.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1��и�");
		} else if (x<0 && y>0) {
			System.out.println("2��и�");
		} else if (x<0 && y<0) {
			System.out.println("3��и�");
		} else {
			System.out.println("4��и�");
		}	
		scan.close();
	}
}




/* ����
Scanner scan = new Scanner(System.in);

int year = 0;

System.out.print("�⵵�� �Է��� �ּ���.");
year = scan.nextInt();

if ((year%4)==0) {
	if(year%100!=0 || year%400 == 0) {
		System.out.println("����");
	}else {
		System.out.println("���� x");
	}

	}else {
		System.out.println("���� x");
}
*/













