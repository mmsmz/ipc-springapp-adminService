package com.ipc.adminService.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class UserDto {

    private String userId;
    private String firstName;
    private String lastName;
    private String nicNr;
    private String email;
    private String mobile;
    private String institutebranch;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    private String password;
    private String useraccounttype;
    private String usertype;

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	private byte loginStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNicNr() {
        return nicNr;
    }

    public void setNicNr(String nicNr) {
        this.nicNr = nicNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInstitutebranch() {
        return institutebranch;
    }

    public void setInstitutebranch(String institutebranch) {
        this.institutebranch = institutebranch;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(byte loginStatus) {
        this.loginStatus = loginStatus;
    }
    public String getUseraccounttype() {
		return useraccounttype;
	}

	public void setUseraccounttype(String useraccounttype) {
		this.useraccounttype = useraccounttype;
	}

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
