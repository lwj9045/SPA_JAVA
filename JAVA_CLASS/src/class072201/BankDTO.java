package class072201;

public class BankDTO {

	private int number;
	private String name;
	private int accountNumber;
	private String pw;
	private int money;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "BankDTO [number=" + number + ", name=" + name + ", accountNumber=" + accountNumber + ", pw=" + pw
				+ ", money=" + money + "]";
	}

	
}
