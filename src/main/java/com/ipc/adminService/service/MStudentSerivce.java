package com.ipc.adminService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.UserDto;

@Service
public interface MStudentSerivce {

   
    //To get students details 
    List<UserDto> getStudentsDetails();
    String addStudentsDetails(UserDto userDto);
    
    UserDto addUser();
	


}
