package com.sporing.app.user.vo;

public class UserVO {
	private int user_num;
	private String user_email;
	private String user_password;
	private String user_name;
	private String user_gender;
	private String user_bitrhday;
	private String user_phone;
	private String user_profile;
	private String user_state;
	private String user_createAt;
	private String user_status;
	
	public UserVO() {;}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_bitrhday() {
		return user_bitrhday;
	}

	public void setUser_bitrhday(String user_bitrhday) {
		this.user_bitrhday = user_bitrhday;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_profile() {
		return user_profile;
	}

	public void setUser_profile(String user_profile) {
		this.user_profile = user_profile;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getUser_createAt() {
		return user_createAt;
	}

	public void setUser_createAt(String user_createAt) {
		this.user_createAt = user_createAt;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public UserVO(int user_num, String user_email, String user_password, String user_name, String user_gender,
			String user_bitrhday, String user_phone, String user_profile, String user_state, String user_createAt,
			String user_status) {
		super();
		this.user_num = user_num;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_gender = user_gender;
		this.user_bitrhday = user_bitrhday;
		this.user_phone = user_phone;
		this.user_profile = user_profile;
		this.user_state = user_state;
		this.user_createAt = user_createAt;
		this.user_status = user_status;
	}

	
	
	
	
}
