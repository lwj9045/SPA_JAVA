package class072001;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardService service = new BoardService();
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();

		boolean run = true;
		int user_num = 0;

		while (run) {
			System.out.println("1.�۾���  2.��ü �� ���  3.�ۼ���  4.�ۻ���  5.����");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				service.InVal(boardList);
				service.write(); // ���� �Է¹���
				if (service.IdCheck(boardList)) { // ID �ߺ� Ȯ��
					service.Add(boardList); // ArrayList�� ����
				}
				break;
			case 2:
				service.print(boardList); // ��ü �� ���
				break;
			case 3:
				boardList = service.Modify(boardList); // �� ����
				break;
			case 4:
				boardList = service.Delete(boardList); // �� ����
				break;
			case 5:
				run = service.Down(); // ���α׷� ����
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. ");

			}
		}
		scan.close();
	}

}
