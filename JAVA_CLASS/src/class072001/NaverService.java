package class072001;

import java.util.*;

public class NaverService {
	Scanner scan1 = new Scanner(System.in);

	public void IdPrint(List<NaverMemberDTO> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getId());
		}
	}

	public void AllPrint(List<NaverMemberDTO> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			System.out
					.println("회원" + (i + 1) + " ID :" + memberList.get(i).getId() + " PW :" + memberList.get(i).getPw()
							+ " 이름 :" + memberList.get(i).getName() + " Phone :" + memberList.get(i).getPhone());
		}
	}
}