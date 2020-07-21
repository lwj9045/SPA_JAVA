package class0710;

public class Ex05_0710 {

	public static void main(String[] args) {
		// 오름차순 정렬

		int num[] = { 9, 2, 4, 6, 7, 1, 8, 5, 3 }; // length = 5
		int save = 0;

		for (int i = 1; i < num.length; i++) { // i = 1,2,3,4
			for (int j = 1; j < num.length; j++) { // j=1,2,3,4
				if (num[j - 1] > num[j]) {
					save = num[j];
					num[j] = num[j - 1];
					num[j - 1] = save;
				}
			}

		}
		for (int k = 0; k < num.length; k++) {
			System.out.print(num[k] + " ");
		}
			
	}
}