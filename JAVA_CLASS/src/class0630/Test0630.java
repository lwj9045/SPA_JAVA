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
			System.out.println("1사분면");
		} else if (x<0 && y>0) {
			System.out.println("2사분면");
		} else if (x<0 && y<0) {
			System.out.println("3사분면");
		} else {
			System.out.println("4사분면");
		}	
		scan.close();
	}
}




/* 윤년
Scanner scan = new Scanner(System.in);

int year = 0;

System.out.print("년도를 입력해 주세용.");
year = scan.nextInt();

if ((year%4)==0) {
	if(year%100!=0 || year%400 == 0) {
		System.out.println("윤년");
	}else {
		System.out.println("윤년 x");
	}

	}else {
		System.out.println("윤년 x");
}
*/













