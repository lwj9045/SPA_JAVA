package class072001;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);
	BoardDTO board = null;

	public void InVal(List<BoardDTO> boardList) {
		board = new BoardDTO();
		boardList.add(board.getNumber(), board);
	}

	public void write() { // ID,PW,내용 입력
		board = new BoardDTO();
		System.out.print("ID를 입력하세요 : ");
		board.setId(scan.next());
		System.out.print("PW를 입력하세요 : ");
		board.setPw(scan.next());
		System.out.print("내용을 입력하세요 : ");
		board.setContents(scan.next());
	}

	public boolean IdCheck(List<BoardDTO> boardList) { // ID 중복 확인
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				System.out.println("중복된 ID가 있습니다.");
				boardList.remove(board.getNumber());
				i = boardList.size();
				return false;
			}
		}
		boardList.remove(board.getNumber());
		return true;
	}

	public void Add(List<BoardDTO> boardList) { // 저장
		boardList.add(board);
		System.out.println("저장 완료");
		board.setNumber(board.getNumber() + 1);
	}

	public void print(List<BoardDTO> boardList) { // 출력
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println((i + 1) + "번 글 : " + boardList.get(i).getContents());
		}
	}

	public void Modify(List<BoardDTO> boardList) { // 글 수정
		board = new BoardDTO();
		System.out.print("ID를 입력하세요 : ");
		board.setId(scan.next());
		System.out.print("PW를 입력하세요 : ");
		board.setPw(scan.next());
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				if (board.getPw().equals(boardList.get(i).getPw())) {
					boardList.remove(i);
					System.out.print("변경할 내용을 입력하세요 : ");
					board.setContents(scan.next());
					boardList.add(i, board);
					System.out.println("변경완료.");
					i = boardList.size();
				} else {
					System.out.println("ID 또는 비밀번호를 확인해주세요.");
				}
			}
		}
	}

	public void Delete(List<BoardDTO> boardList) { // 글 삭제
		board = new BoardDTO();
		System.out.print("ID를 입력하세요 : ");
		board.setId(scan.next());
		System.out.print("PW를 입력하세요 : ");
		board.setPw(scan.next());
		for (int i = 0; i < boardList.size(); i++) {
			if (board.getId().equals(boardList.get(i).getId())) {
				if (board.getPw().equals(boardList.get(i).getPw())) {
					System.out.println("삭제완료 : ");
					boardList.remove(i);
				}
			}
		}

	}

	public boolean Down() { // 프로그램 종료
		System.out.println("종료합니다. ");
		return false;

	}

}
