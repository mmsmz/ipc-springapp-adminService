package com.ipc.adminService.controller;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.ResponseDto;
import com.ipc.adminService.service.MStudentSerivce;
import com.ipc.adminService.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/adminService")
public class MCoursePriceController {
    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(MUsersController.class);

    @Autowired
    MStudentSerivce mStudentSerivce;

    @GetMapping("/welcome")
    String admin() {
        return "<h1>Welcome To Manage Course Price Details !!!</h1>";
    }


    /**
     * Add course Details to table
     *
     */
    @PostMapping(value = "/addCoursePriceDetails", produces = "application/json")
    public ResponseEntity<ResponseDto> addCoursePriceDetails(@RequestBody CoursePriceDto coursePriceDto) {
        logger.info("Inside the Add Course Price Details method Start {}", coursePriceDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
//        responseDto.setData(mStudentSerivce.addCoursePriceDetails(coursePriceDto));
        logger.info("Inside the Add Course Price Details method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);

    }


}
