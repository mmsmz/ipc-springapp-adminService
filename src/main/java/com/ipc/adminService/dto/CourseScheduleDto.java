package com.ipc.adminService.dto;

public class CourseScheduleDto {

	private String courseScheduleId;
	private String coursePriceId;
	private String day;
	private String time;
	private String passcode;


	private String meetingid;


	private String lecturername;



	public CourseScheduleDto() {}

	public CourseScheduleDto(String courseScheduleId, String coursePriceId, String day, String time) {
		this.courseScheduleId = courseScheduleId;
		this.coursePriceId = coursePriceId;
		this.day = day;
		this.time = time;
		this.passcode = passcode;
		this.meetingid = meetingid;
		this.lecturername = lecturername;
	}

	public String getCoursePriceId() {
		return coursePriceId;
	}

	public void setCoursePriceId(String coursePriceId) {
		this.coursePriceId = coursePriceId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCourseScheduleId() {
		return courseScheduleId;
	}

	public void setCourseScheduleId(String courseScheduleId) {
		this.courseScheduleId = courseScheduleId;
	}

	@Override
	public String toString() {
		return "CourseScheduleDto{" +
				"courseScheduleId='" + courseScheduleId + '\'' +
				", coursePriceId='" + coursePriceId + '\'' +
				", day='" + day + '\'' +
				", time=" + time +
				'}';
	}

	public void setMessage(String success) {
		// TODO Auto-generated method stub

	}
	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public String getMeetingid() {
		return meetingid;
	}

	public void setMeetingid(String meetingid) {
		this.meetingid = meetingid;
	}
	public String getLecturername() {
		return lecturername;
	}

	public void setLecturername(String lecturername) {
		this.lecturername = lecturername;
	}
}
