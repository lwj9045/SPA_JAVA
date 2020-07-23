package class072201;

import java.util.*;

public class LibraryService {

	Scanner scan = new Scanner(System.in);
	MemberDTO memberData = null;
	BookDTO bookData = null;

	public void AddMember(List<MemberDTO> memberList) {
		memberData = new MemberDTO();

		System.out.print("이름 : ");
		memberData.setName(scan.next());
		System.out.print("전화번호 : ");
		memberData.setPhone(scan.next());
		memberData.setMemNumber(memberList.size() + 1);
		memberList.add(memberData);
	}

	public void AddBook(List<BookDTO> bookList) {
		bookData = new BookDTO();

		System.out.print("도서 명 : ");
		bookData.setBookname(scan.next());
		System.out.print("저자 : ");
		bookData.setAuthor(scan.next());
		bookData.setBooknumber(bookList.size() + 1);
		bookList.add(bookData);
	}

	public void LendBook(List<BookDTO> bookList, List<MemberDTO> memberList) {
		System.out.print("고객 번호 : ");
		int memnumber = scan.nextInt();
		System.out.print("빌릴 책 번호 : ");
		int booknumber = scan.nextInt();

		if (memnumber <= memberList.size()) {
			if (booknumber <= bookList.size()) {
				if (memnumber == memberList.get(memnumber - 1).getMemNumber()) {
					if (bookList.get(booknumber - 1).isCheck() == true) {
						System.out.println("대출이 완료되었습니다.");
						bookList.get(booknumber - 1).setClientNumber(memnumber);
						bookList.get(booknumber - 1).setCheck(false);
					} else {
						System.out.println("대출이 불가능한 책 입니다.");
					}
				}
			} else {
				System.out.println("등록되지않은 책입니다.");
			}
		} else {
			System.out.println("등록되지않은 고객입니다.");
		}
	}

	public void PrintBook(List<BookDTO> bookList) {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

}
