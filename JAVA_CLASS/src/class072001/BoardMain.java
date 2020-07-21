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
			System.out.println("1.글쓰기  2.전체 글 출력  3.글수정  4.글삭제  5.종료");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				service.InVal(boardList);
				service.write(); // 내용 입력받음
				if (service.IdCheck(boardList)) { // ID 중복 확인
					service.Add(boardList); // ArrayList에 저장
				}
				break;
			case 2:
				service.print(boardList); // 전체 글 출력
				break;
			case 3:
				boardList = service.Modify(boardList); // 글 수정
				break;
			case 4:
				boardList = service.Delete(boardList); // 글 삭제
				break;
			case 5:
				run = service.Down(); // 프로그램 종료
				break;
			default:
				System.out.println("잘못된 입력입니다. ");

			}
		}
		scan.close();
	}

}
