package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.UserDto;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    // To Add Course & Price Details
    String addCoursePriceDetails(CoursePriceDto coursePriceDto);
    //To get Course & Price 
    List<CoursePriceDto> getCoursePriceDetails();
    String updateCoursePriceDetails(CoursePriceDto coursePriceDto);
    
    UserDto addUser();
	List<UserDto>  getStudentsDetails();
	String addStudentsDetails(UserDto userDto);
	String updateStudentsDetails(UserDto userDto);
}
