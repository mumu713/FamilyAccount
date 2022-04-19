package com.fa.dto;

/**
 * 
 * @author
 */
public class User {
	private int userId;
	private String userName;
	private String userPassword;
	
	public User(){
		super();
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				'}';
	}
}
