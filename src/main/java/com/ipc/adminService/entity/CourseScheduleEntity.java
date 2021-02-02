package com.ipc.adminService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="courseschedule")
public class CourseScheduleEntity {
	
@Id
@GenericGenerator(name = "sequence_crsschedid", strategy = "com.ipc.adminService.util.generateid.CourseScheduleIdGenerator")
@GeneratedValue(generator = "sequence_crsschedid")
@Column(name = "crsschedid",nullable = false)
private String courseScheduleId;

@Column(name = "crsprid")
private String coursePriceId;

@Column(name = "day")
private String day;

@Column(name = "time")
private String time;

@Column(name = "passcode")
private String passcode;

public String getPasscode() {
	return passcode;
}

public void setPasscode(String passcode) {
	this.passcode = passcode;
}

@Column(name = "meetingid")
private String meetingid;

public String getMeetingid() {
	return meetingid;
}

public void setMeetingid(String meetingid) {
	this.meetingid = meetingid;
}

@Column(name = "lecturername")
private String lecturername;

public String getLecturername() {
	return lecturername;
}

public void setLecturername(String lecturername) {
	this.lecturername = lecturername;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public String getCoursePriceId() {
	return coursePriceId;
}

public void setCoursePriceId(String coursePriceId) {
	this.coursePriceId = coursePriceId;
}

public String getCourseScheduleId() {
	return courseScheduleId;
}

public void setCourseScheduleId(String courseScheduleId) {
	this.courseScheduleId = courseScheduleId;
}

}
