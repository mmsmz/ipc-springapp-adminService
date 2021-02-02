package com.ipc.adminService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ipc.adminService.dto.CourseScheduleDto;
import com.ipc.adminService.dto.UserDto;

@Service
public interface MCourseScheduleService {
	   
    //To update CourseSchedule details 
	String addCourseScheduleDetails(CourseScheduleDto courseScheduleDto);
}
