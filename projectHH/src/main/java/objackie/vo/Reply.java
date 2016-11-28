package objackie.vo;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Reply implements Serializable {
	private static final long serialVersionUID = 1L;
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	protected int reno;
	protected int no;
	protected String email;
	protected String reContents;
	protected Date createdDate;
	protected String name;
	protected String phoPath;

	public int getReno() {
		return reno;
	}

	public void setReno(int reno) {
		this.reno = reno;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReContents() {
		return reContents;
	}

	public void setReContents(String reContents) {
		this.reContents = reContents;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoPath() {
		return phoPath;
	}

	public void setPhoPath(String phoPath) {
		this.phoPath = phoPath;
	}

	@Override
	public String toString() {
		return "Reply [reno=" + reno + ", no=" + no + ", email=" + email + ", reContents=" + reContents + ", createdDate="
				+ createdDate + ", name=" + name + ", phoPath=" + phoPath + "]";
	}

}
