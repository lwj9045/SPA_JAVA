package class0713;

import java.util.*;

public class Ex06_0713 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ans[][] = { { "의자", "책상", "물" }, { "연필", "시계" } };
		String que[][] = { { "chair", "desk", "water" }, { "pencil", "watch" } };
		String user = "";
		int count = 0;
		double ans_per = 0, ans_count = 0;

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				count++;
				System.out.print("문제" + count + ". " + que[i][j] + "의 뜻은 무엇인가요?");
				user = scan.next();
				if (user.equals(ans[i][j])) {
					System.out.println("정답입니다. ");
					ans_count++;
				} else {
					System.out.println("틀렸습니다. ");
					System.out.println("정답은 " + ans[i][j] + "입니다. ");
				}
			}
		}
		scan.close();
		ans_per = (ans_count / count) * 100;
		System.out.println("총 " + ans_count + "개 정답입니다. ");
		System.out.println("정답률은 " + ans_per + "% 입니다. ");
	}

}