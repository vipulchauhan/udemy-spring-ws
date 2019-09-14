package io.vnc.mvc.dto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class User {
	private String username;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private Long mobile;
	private String role;
	private String gender;
	private List<String> notificationPref;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getNotificationPref() {
		return notificationPref;
	}

	public void setNotificationPref(List<String> notificationPref) {
		this.notificationPref = notificationPref;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", mobile=" + mobile + ", role=" + role + ", gender=" + gender
				+ ", notificationPref=" + notificationPref + "]";
	}

}
