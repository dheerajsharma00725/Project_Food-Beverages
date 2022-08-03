package com.user.manage;

import java.sql.Timestamp;
import java.sql.Date;

public class User {
	
	private String fname;
	private String lname;
	private String uid;
	private Date dob;
	private String mobile;
	private String email;
	private String upwd;
	private Timestamp created_tmstmp;
	private Timestamp updated_tmstmp;
	
	public User(String fname, String lname, String uid, Date dob, String mobile, String email, String upwd,
			Timestamp created_tmstmp, Timestamp updated_tmstmp) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uid = uid;
		this.dob = dob;
		this.mobile = mobile;
		this.email = email;
		this.upwd = upwd;
		this.created_tmstmp = created_tmstmp;
		this.updated_tmstmp = updated_tmstmp;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", uid=" + uid + ", dob=" + dob + ", mobile=" + mobile
				+ ", email=" + email + ", upwd=" + upwd + ", created_tmstmp=" + created_tmstmp + ", updated_tmstmp="
				+ updated_tmstmp + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Timestamp getCreated_tmstmp() {
		return created_tmstmp;
	}

	public void setCreated_tmstmp(Timestamp created_tmstmp) {
		this.created_tmstmp = created_tmstmp;
	}

	public Timestamp getUpdated_tmstmp() {
		return updated_tmstmp;
	}

	public void setUpdated_tmstmp(Timestamp updated_tmstmp) {
		this.updated_tmstmp = updated_tmstmp;
	}
}
