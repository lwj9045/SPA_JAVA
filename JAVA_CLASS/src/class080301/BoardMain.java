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
			System.out.println("0.DB접속  1.글 작성  2.글 전체조회  3.글 상세조회  4.인기 글 목록  5.글 수정  6.글 삭제");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			user_num = scan.nextInt();

			switch (user_num) {
			case 0: // DB Connection
				bDAO.DBConnection();
				break;
			case 1: // 글 작성(제목, 작성자, 내용)
				bDTO = new BoardDTO();
				System.out.print("제목 : ");
				bDTO.setBtitle(scan.next());
				System.out.print("작성자 : ");
				bDTO.setBwriter(scan.next());
				System.out.print("내용 : ");
				bDTO.setBcontents(scan.next());

				if (bDAO.Write(bDTO)) {
					System.out.println("작성 완료");
				} else {
					System.out.println("작성 실패");
				}
				break;
			case 2: // 글 전체조회
				bDAO.PrintAll();
				break;
			case 3: // 글 상세조회(글 번호 입력, 조회수 1 추가)
				bDTO = new BoardDTO();
				System.out.print("조회할 글 번호 : ");
				bDTO.setBnumber(scan.nextInt());
				bDAO.FindBnumber(bDTO);
				break;
			case 4: // 인기 글 목록
				bDAO.OrderByBhits();
				break;
			case 5: // 글 수정(글번호 입력, 수정내용 입력)
				bDTO = new BoardDTO();
				System.out.print("수정할 글 번호 : ");
				bDTO.setBnumber(scan.nextInt());
				System.out.print("수정할 내용 : ");
				bDTO.setBcontents(scan.next());
				if (bDAO.Modify(bDTO)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 6: // 글 삭제
				bDTO = new BoardDTO();
				System.out.print("삭제할 글 번호 : ");
				bDTO.setBnumber(scan.nextInt());
				if (bDAO.Delete(bDTO)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
