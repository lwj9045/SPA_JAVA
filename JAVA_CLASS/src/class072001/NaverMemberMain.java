package class072001;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<NaverMemberDTO> memberList = new ArrayList<NaverMemberDTO>();
		NaverMemberDTO member = null;
		NaverService service = new NaverService();
		
		boolean run = true;
		int user_num = 0;

		while (run) {
			System.out.println("1.회원등록 | 2.회원 전체 ID 확인 | 3. 회원 전체 ID,PW 확인 | 4. 종료");
			user_num = scan.nextInt();

			switch (user_num) {
			case 1:
				member = new NaverMemberDTO();
				System.out.print("iD를 입력하세요 : ");
				member.setId(scan.next());
				System.out.print("PW를 입력하세요 : ");
				member.setPw(scan.next());
				System.out.print("이름를 입력하세요 : ");
				member.setName(scan.next());
				System.out.print("전화번호를 입력하세요 : ");
				member.setPhone(scan.next());
				memberList.add(member);
				break;
			case 2:
				service.IdPrint(memberList);
				break;
			case 3:
				service.AllPrint(memberList);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. ");
			}
		}
		scan.close();
	}

}
