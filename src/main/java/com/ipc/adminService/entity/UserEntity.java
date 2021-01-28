package com.ipc.adminService.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GenericGenerator(name = "sequence_user_id", strategy = "com.ipc.adminService.util.generateid.UserIdGenerator")
    @GeneratedValue(generator = "sequence_user_id")
    @Column(name = "userid")
    private String userId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "nicnr")
    private String nicnr;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "institutebranch")
    private String instituteBranch;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "usertype")
    private String userType;

    @Column(name = "password")
    private String password;

    @Column(name = "loginstatus")
    private byte loginstatus;
    
    @Column(name = "useraccounttype")
    private String useraccounttype;

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

    public String getNicnr() {
        return nicnr;
    }

    public void setNicnr(String nicnr) {
        this.nicnr = nicnr;
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

    public String getInstituteBranch() {
        return instituteBranch;
    }

    public void setInstituteBranch(String instituteBranch) {
        this.instituteBranch = instituteBranch;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(byte loginstatus) {
        this.loginstatus = loginstatus;
    }

    public String getUseraccounttype() {
        return useraccounttype;
    }

    public void setUseraccounttype(String useraccounttype) {
        this.useraccounttype = useraccounttype;
    }
}
