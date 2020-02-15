package io.vnc.mvc.dto;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull()
	@Size(min = 8, max = 15)
	private String username;

	@NotNull(message = "Enter Email Address")
	private String email;

	@NotNull(message = "Enter Password")
	@Size(min = 6, max = 15)
	private String password;

	@NotNull(message = "Enter first name")
	private String firstname;

	@NotNull(message = "Enter last name")
	private String lastname;

	@NotNull(message = "Enter mobile no")
	@Min(value = 4000000000L, message = "mobile no must be of 10 digits")
	@Max(value = 9999999999L, message = "mobile no must be of 10 digits")
	private Long mobile;

	@NotNull(message = "Enter Role")
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
