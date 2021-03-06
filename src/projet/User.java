package projet;

public class User implements Comparable<User>{
	public String name;
	public String tel;		
	public String mail;
	
	

	
	

	public User(String name, String tel, String mail) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.tel = tel;
		this.mail = mail;
	}

	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setTel (String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return this.mail;
	}



	@Override
	public int compareTo(User other) {
		int cmp = this.getName().compareTo(other.getName());
		if(cmp != 0)
			return cmp;
		return this.getName().compareTo(other.getName());

	}
	
	
	
	
}
