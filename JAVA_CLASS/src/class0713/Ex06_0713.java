package class0713;

import java.util.*;

public class Ex06_0713 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ans[][] = { { "����", "å��", "��" }, { "����", "�ð�" } };
		String que[][] = { { "chair", "desk", "water" }, { "pencil", "watch" } };
		String user = "";
		int count = 0;
		double ans_per = 0, ans_count = 0;

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				count++;
				System.out.print("����" + count + ". " + que[i][j] + "�� ���� �����ΰ���?");
				user = scan.next();
				if (user.equals(ans[i][j])) {
					System.out.println("�����Դϴ�. ");
					ans_count++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�. ");
					System.out.println("������ " + ans[i][j] + "�Դϴ�. ");
				}
			}
		}
		scan.close();
		ans_per = (ans_count / count) * 100;
		System.out.println("�� " + ans_count + "�� �����Դϴ�. ");
		System.out.println("������� " + ans_per + "% �Դϴ�. ");
	}

}