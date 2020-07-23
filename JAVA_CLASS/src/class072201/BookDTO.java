package class072201;

public class BookDTO {

	private int booknumber;
	private String bookname;
	private String author;
	private boolean check = true;
	private int clientNumber;

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "BookDTO [booknumber=" + booknumber + ", bookname=" + bookname + ", author=" + author + ", check="
				+ check + ", clientNumber=" + clientNumber + "]";
	}

}
