package class072001;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);
	BoardDTO board = null;

	public void InVal(List<BoardDTO> boardList) {
		board = new BoardDTO();
		boardList.add(board.getNumber(), board);
	}

	public void write() { // ID,PW,���� �Է�
		board = new BoardDTO();
		System.out.print("ID�� �Է��ϼ��� : ");
		board.setId(scan.next());
		System.out.print("PW�� �Է��ϼ��� : ");
		board.setPw(scan.next());
		System.out.print("������ �Է��ϼ��� : ");
		board.setContents(scan.next());
	}

	public boolean IdCheck(List<BoardDTO> boardList) { // ID �ߺ� Ȯ��
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				System.out.println("�ߺ��� ID�� �ֽ��ϴ�.");
				boardList.remove(board.getNumber());
				i = boardList.size();
				return false;
			}
		}
		boardList.remove(board.getNumber());
		return true;
	}

	public void Add(List<BoardDTO> boardList) { // ����
		boardList.add(board);
		System.out.println("���� �Ϸ�");
		board.setNumber(board.getNumber() + 1);
	}

	public void print(List<BoardDTO> boardList) { // ���
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println((i + 1) + "�� �� : " + boardList.get(i).getContents());
		}
	}

	public void Modify(List<BoardDTO> boardList) { // �� ����
		board = new BoardDTO();
		System.out.print("ID�� �Է��ϼ��� : ");
		board.setId(scan.next());
		System.out.print("PW�� �Է��ϼ��� : ");
		board.setPw(scan.next());
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				if (board.getPw().equals(boardList.get(i).getPw())) {
					boardList.remove(i);
					System.out.print("������ ������ �Է��ϼ��� : ");
					board.setContents(scan.next());
					boardList.add(i, board);
					System.out.println("����Ϸ�.");
					i = boardList.size();
				} else {
					System.out.println("ID �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
				}
			}
		}
	}

	public void Delete(List<BoardDTO> boardList) { // �� ����
		board = new BoardDTO();
		System.out.print("ID�� �Է��ϼ��� : ");
		board.setId(scan.next());
		System.out.print("PW�� �Է��ϼ��� : ");
		board.setPw(scan.next());
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				if (board.getPw().equals(boardList.get(i).getPw())) {
					System.out.println("�����Ϸ� : ");
					boardList.remove(i);
				}
			}
		}

	}

	public boolean Down() { // ���α׷� ����
		System.out.println("�����մϴ�. ");
		return false;

	}

}
