package class072201;

import java.util.*;

public class Test11 {

	BankDTO bank1 = null;
	Scanner scan = new Scanner(System.in);

	public boolean banktest1(int num) {
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void banktest2(int num) {
		if (banktest1(num)) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}

	}

}
