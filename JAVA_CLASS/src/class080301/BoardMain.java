package class080301;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDAO bDAO = new BoardDAO();
		BoardDTO bDTO = null;

		int user_num = 0;
		boolean run = true;

		while (run) {
			System.out.println("----------------------------");
			System.out.println("0.DB����  1.�� �ۼ�  2.�� ��ü��ȸ  3.�� ����ȸ  4.�α� �� ���  5.�� ����  6.�� ����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 0: // DB Connection
				bDAO.DBConnection();
				break;
			case 1: // �� �ۼ�(����, �ۼ���, ����)
				bDTO = new BoardDTO();
				System.out.print("���� : ");
				bDTO.setBtitle(scan.next());
				System.out.print("�ۼ��� : ");
				bDTO.setBwriter(scan.next());
				System.out.print("���� : ");
				bDTO.setBcontents(scan.next());

				if (bDAO.Write(bDTO)) {
					System.out.println("�ۼ� �Ϸ�");
				} else {
					System.out.println("�ۼ� ����");
				}
				break;
			case 2: // �� ��ü��ȸ
				bDAO.PrintAll();
				break;
			case 3: // �� ����ȸ(�� ��ȣ �Է�, ��ȸ�� 1 �߰�)
				bDTO = new BoardDTO();
				System.out.print("��ȸ�� �� ��ȣ : ");
				bDTO.setBnumber(scan.nextInt());
				bDAO.FindBnumber(bDTO);
				break;
			case 4: // �α� �� ���
				bDAO.OrderByBhits();
				break;
			case 5: // �� ����(�۹�ȣ �Է�, �������� �Է�)
				bDTO = new BoardDTO();
				System.out.print("������ �� ��ȣ : ");
				bDTO.setBnumber(scan.nextInt());
				System.out.print("������ ���� : ");
				bDTO.setBcontents(scan.next());
				if (bDAO.Modify(bDTO)) {
					System.out.println("���� �Ϸ�");
				} else {
					System.out.println("���� ����");
				}
				break;
			case 6: // �� ����
				bDTO = new BoardDTO();
				System.out.print("������ �� ��ȣ : ");
				bDTO.setBnumber(scan.nextInt());
				if (bDAO.Delete(bDTO)) {
					System.out.println("���� �Ϸ�");
				} else {
					System.out.println("���� ����");
				}
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}

}
