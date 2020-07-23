package class072201;

import java.util.*;

public class BankService {

	Scanner scan = new Scanner(System.in);
	BankDTO bankData = null;

	public void Initial(List<BankDTO> clientList) {
		bankData = new BankDTO();
		clientList.add(bankData);
	}

	public void Client(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("성함을 입력하세요 : ");
		bankData.setName(scan.next());
		System.out.print("사용하실 계좌번호를 입력하세요 : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("사용하실 비밀번호를 입력하세요 : ");
		bankData.setPw(scan.next());
		System.out.print("계좌에 입금할 금액을 입력하세요 : ");
		bankData.setMoney(scan.nextInt());
		bankData.setNumber(clientList.size());
	}

	public boolean Check(List<BankDTO> clientList) {
		for (int i = 0; i < clientList.size(); i++) {
			if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
				return false;
			}
		}
		return true;
	}

	public void Add(List<BankDTO> clientList) {
		if (Check(clientList)) {
			clientList.add(bankData);
			System.out.println("등록 완료");
		} else {
			System.out.println("중복된 계좌 입니다.");
		}
	}

	public List<BankDTO> Deposit(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("입금하실 계좌번호를 입력하세요 : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("비밀번호를 입력하세요 : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("등록되지 않은 계좌입니다.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.print("입금하실 금액을 입력하세요 : ");
						int money = scan.nextInt();
						clientList.get(i).setMoney(clientList.get(i).getMoney() + money);
						System.out.println("입금완료");
						System.out.println("잔액은 " + clientList.get(i).getMoney() + "원 입니다.");
					} else {
						System.out.println("계좌번호와 비밀번호가 맞는지 확인하세요.");
					}
				}
			}
		}
		return clientList;
	}

	public List<BankDTO> WithDraw(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("출금하실 계좌번호를 입력하세요 : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("비밀번호를 입력하세요 : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("등록되지 않은 계좌입니다.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.print("출금하실 금액을 입력하세요 : ");
						int money = scan.nextInt();
						if (clientList.get(i).getMoney() >= money) {
							clientList.get(i).setMoney(clientList.get(i).getMoney() - money);
							System.out.println("출금완료");
							System.out.println("잔액은 " + clientList.get(i).getMoney() + "원 입니다.");
						} else {
							System.out.println("잔액이 부족합니다.");
						}

					} else {
						System.out.println("계좌번호와 비밀번호가 맞는지 확인하세요.");
					}
				}
			}
		}
		return clientList;
	}

	public void PrintMoney(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("잔액확인하실 계좌번호를 입력하세요 : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("비밀번호를 입력하세요 : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("등록되지 않은 계좌입니다.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.println("잔액은 " + clientList.get(i).getMoney() + "원 입니다.");
					} else {
						System.out.println("계좌번호와 비밀번호가 맞는지 확인하세요.");
					}
				}

			}
		}
	}

	public void PrintClient(List<BankDTO> clientList) {
		bankData = new BankDTO();
		System.out.print("확인하실 계좌번호를 입력하세요 : ");
		bankData.setAccountNumber(scan.nextInt());
		System.out.print("비밀번호를 입력하세요 : ");
		bankData.setPw(scan.next());

		if (Check(clientList)) {
			System.out.println("등록되지 않은 계좌입니다.");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				if (bankData.getAccountNumber() == clientList.get(i).getAccountNumber()) {
					if (bankData.getPw().equals(clientList.get(i).getPw())) {
						System.out.println("회원번호 : " + clientList.get(i).getNumber());
						System.out.println("이름 : " + clientList.get(i).getName());
						System.out.println("계좌번호 : " + clientList.get(i).getAccountNumber());
						System.out.println("비밀번호 : " + clientList.get(i).getPw());
						System.out.println("잔액 : " + clientList.get(i).getMoney() + "원");
					} else {
						System.out.println("계좌번호와 비밀번호가 맞는지 확인하세요.");
					}
				}
			}
		}
	}

	public boolean End() {
		System.out.println("종료합니다.");
		return false;
	}

}
