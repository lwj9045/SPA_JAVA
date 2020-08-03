package class073102;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mDAO = new MemberDAO();
		MemberDTO mDTO = null;
		boolean run = true;

		while (run) {
			System.out.println("-----------------------");
			System.out.println("0.종료  1.회원가입  2.로그인  3.전체 조회  4.ID 중복확인   5.PW수정  6.회원탈퇴");
			System.out.println("-----------------------");
			System.out.print("선택 > ");
			int user_num = scan.nextInt();
			switch (user_num) {
			case 0: //종료
				run = false;
				System.out.println("종료합니다.");
				break;
			case 1: // 회원가입
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				System.out.print("PW : ");
				mDTO.setMpassword(scan.next());
				System.out.print("이름 : ");
				mDTO.setMname(scan.next());
				System.out.print("핸드폰 : ");
				mDTO.setMphone(scan.next());
				System.out.print("나이 : ");
				mDTO.setMage(scan.nextInt());

				if (mDAO.InsertMember(mDTO) == 1) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}
				break;
			case 2: // 로그인
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				System.out.print("PW : ");
				mDTO.setMpassword(scan.next());
//				mDAO.Login(mDTO);
				if (mDAO.Login(mDTO)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("아이디 또는 비밀번호를 확인하세요.");
				}
				break;
			case 3: // 전체조회
				mDAO.Connection();
				mDAO.SelectAll();
				break;
			case 4: // ID 중복체크
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.print("ID : ");
				mDTO.setMid(scan.next());
				if(mDAO.IdCheck(mDTO)) {
					System.out.println("중복된 아이디 입니다.");
				}else {
					System.out.println("사용가능한 아이디 입니다.");
				}
				break;
			case 5: // PW수정
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.println("ID : ");
				mDTO.setMid(scan.next());
				System.out.println("변경할 PW : ");
				mDTO.setMpassword(scan.next());
				if(mDAO.ModifyPW(mDTO)) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
				
				break;
			case 6: // 회원 탈퇴
				mDAO.Connection();
				mDTO = new MemberDTO();
				System.out.println("ID : ");
				mDTO.setMid(scan.next());
				if(mDAO.DeleteId(mDTO)) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		scan.close();
	}
}
