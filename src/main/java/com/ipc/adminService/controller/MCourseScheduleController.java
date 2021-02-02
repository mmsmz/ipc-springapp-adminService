package com.ipc.adminService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.CourseScheduleDto;
import com.ipc.adminService.dto.ResponseDto;

import com.ipc.adminService.service.MCourseScheduleService;
import com.ipc.adminService.service.MStudentSerivce;
import com.ipc.adminService.util.CommonConstant;

@RestController
@CrossOrigin("*")
@RequestMapping("/courseScheduleService")
public class MCourseScheduleController {
	 final Logger logger = LoggerFactory.getLogger(MCourseScheduleController.class);

	    @Autowired
	    MCourseScheduleService mCourseScheduleService;

	    @GetMapping("/welcome")
	    String admin() {
	        return "<h1>Welcome To Manage Course Schedule Details !!!</h1>";
	    }

	    @PostMapping(value = "/updateCourseScheduleDetails", produces = "application/json")
	    public ResponseEntity<ResponseDto> updateCourseScheduleDetails() {
	      //  logger.info("Inside the update Course Schedule Details method Start {}", courseScheduleDto.toString());

	        ResponseDto responseDto = new ResponseDto();
	        responseDto.setMessage(CommonConstant.SUCCESS);
//	        responseDto.setData(mStudentSerivce.addCoursePriceDetails(coursePriceDto));
	        logger.info("Inside the update Course Schedule Details method End");

	        return new ResponseEntity<>(responseDto, HttpStatus.OK);

	    }
}
