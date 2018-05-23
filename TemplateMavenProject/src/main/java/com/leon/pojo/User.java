package com.leon.pojo;

public class User {
	private Integer id;

	private String userName;

	private String password;

	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User() {
		super();
	}

	public User(Integer id, String userName, String password, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

}
