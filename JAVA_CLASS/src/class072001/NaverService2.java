package class072001;
import java.util.*;
public class NaverService2 {

	Scanner scan = new Scanner(System.in);
	NaverMemberDTO2 memberDTO = null;
//	List<NaverMemberDTO2> MemberList = new ArrayList<NaverMemberDTO2>();
	
	
	public void Create() {
		memberDTO = new NaverMemberDTO2();
		System.out.print("ID를 입력하세요 : ");
		memberDTO.setId(scan.next());
		System.out.print("PW를 입력하세요 : ");
		memberDTO.setPw(scan.next());
		System.out.print("이름를 입력하세요 : ");
		memberDTO.setName(scan.next());
		System.out.print("주소를 입력하세요 : ");
		memberDTO.setAddress(scan.next());
		System.out.println(memberDTO.getId());
//		MemberList.add(memberDTO);
	}
	public void Add (List<NaverMemberDTO2> MemberList) {
		MemberList.add(memberDTO);
	}
	
	public void IdView(List<NaverMemberDTO2> MemberList) {
		for(int i =0; i<MemberList.size(); i++) {
			System.out.println(MemberList.get(i).getId());
		}
	}
	
	public void AllView(List<NaverMemberDTO2> MemberList) {
		for(int i =0; i<MemberList.size(); i++) {
		System.out.println(MemberList.get(i));
		}
	}
	
	public boolean Quit() {
		System.out.println("종료합니다. ");
		return false;
		
	}
}
