package org.platform.services.api1.domain;
/**
 * 
 * @author Brook
 *
 */
public class User {
	
	private String userName;
	
	private String gender;

	private String email;
	
	private String mobileNo;
	
	private String address;

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public User setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public User setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public User setAddress(String address) {
		this.address = address;
		return this;
	}
	
	

}
