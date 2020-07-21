package class072101_Teacher;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);

	public void listView(List<BoardDTO> boardList) {
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}

	public List<BoardDTO> boardModify(List<BoardDTO> boardList) {
		System.out.print("수정 글번호 : ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.next();

		for (int i = 0; i < boardList.size(); i++) {
			if (bnumber == boardList.get(i).getBnumber() && password.equals(boardList.get(i).getPassword())) {
				System.out.print("수정내용 입력 : ");
				String contents = scan.next();

				boardList.get(i).setContents(contents);
				System.out.println("내용" + contents);
				System.out.println("수정완료");
				break;
			}
		}
		return boardList;
	}

	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		System.out.print("삭제 글번호 : ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.next();

		for (int i = 0; i < boardList.size(); i++) {
			if (bnumber == boardList.get(i).getBnumber() && password.equals(boardList.get(i).getPassword())) {
				boardList.remove(i);
				System.out.println("삭제완료");
				break;
			}
		}
		return boardList;
	}

}
