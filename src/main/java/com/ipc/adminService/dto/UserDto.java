package com.ipc.adminService.dto;

import java.time.Instant;

public class UserDto {

    private String userId;
    private String firstName;
    private String lastName;
    private String nicNr;
    private String email;
    private String mobile;
    private String institutebranch;
    private Instant date;
    private String password;
    private byte loginStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
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
}
