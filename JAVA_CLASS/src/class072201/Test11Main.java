package class072201;
import java.util.*;
public class Test11Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test11 T1 = new Test11();
		int num = 0;
		num = scan.nextInt();
//		T1.banktest1(num);
		T1.banktest2(num);
		
		num = scan.nextInt();
		T1.banktest2(num);
	}

}
