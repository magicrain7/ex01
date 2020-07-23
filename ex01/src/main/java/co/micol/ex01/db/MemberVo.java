package co.micol.ex01.db;

public class MemberVo {
	private String id;
	private String password;
	private String name;
	private String tel;
	
	public MemberVo() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		System.out.println("==아이디    패스워드  이름   전화번호 ==");
		System.out.print("   " + getId() + "  ");
		System.out.print(getPassword() + "  ");
		System.out.print(getName() + "  ");
		System.out.println(getTel() + "  ");
		return null;
	}
}
