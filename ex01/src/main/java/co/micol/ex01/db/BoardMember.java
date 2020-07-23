package co.micol.ex01.db;

public class BoardMember {
	private int rno;
	private String name;
	private String title;
	private String contents;
	public BoardMember() {
		// TODO Auto-generated constructor stub
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String toString() {
		System.out.print(getRno() + "  ");
		System.out.print(getName() + "  ");
		System.out.print(getTitle() + "  ");
		System.out.println(getContents() + "  ");
		return null;
	}
}
