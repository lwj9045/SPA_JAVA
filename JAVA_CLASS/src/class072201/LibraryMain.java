package class072201;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryService service = new LibraryService();
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		
		int user_num = 0;
		boolean run = true;
		
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.회원등록 | 2.책 등록 | 3.도서 대출 | 4.도서 목록 | 5.종료| ");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			user_num = scan.nextInt();
			
			switch (user_num) {
			case 1: // 회원등록
				service.AddMember(memberList);
				break;

			case 2: // 책 등록
				service.AddBook(bookList);
				break;

			case 3: // 도서 대출
				service.LendBook(bookList,memberList);
				break;

			case 4: // 도서 목록
				service.PrintBook(bookList);
				break;

			case 5: // 종료
				run = false;
				break;
				
			default :
				System.out.println("잘못된 입력입니다. ");
			}
		}

	}

}
