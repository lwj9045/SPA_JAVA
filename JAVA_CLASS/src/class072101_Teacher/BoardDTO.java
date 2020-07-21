package class072101_Teacher;

public class BoardDTO {
	private int bnumber;
	private String title;
	private String contents;
	private String password;

	public BoardDTO(int bnumber, String title, String contents, String password) {
		super();
		this.bnumber = bnumber;
		this.title = title;
		this.contents = contents;
		this.password = password;
	}

	public BoardDTO() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	@Override
	public String toString() {
		return "BoardDTO [bnumber=" + bnumber + ", title=" + title + ", contents=" + contents + ", password=" + password
				+ "]";
	}

}
