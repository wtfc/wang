package com.wang.ssm.po;

/**
 * 用户实体类
 */
public class User{
	/** 用户姓名 */
	private String userName;
	/** 用户性别 */
	private String userSex;
	/** 用户年龄 */
	private String userAge;
	/** 用户地址 */
	private String userAddrss;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserAddrss() {
		return userAddrss;
	}
	public void setUserAddrss(String userAddrss) {
		this.userAddrss = userAddrss;
	}

}
