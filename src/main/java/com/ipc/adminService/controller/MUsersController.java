package com.ipc.adminService.controller;

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
@CrossOrigin(value = "*")
@RequestMapping("/user")
public class MUsersController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(MUsersController.class);

    @Autowired
    MStudentSerivce mStudentSerivce;

    @GetMapping("/admin")
    String admin() {
        return "<h1>Welcome!!!</h1>";
    }
//get data from user db
    @GetMapping(value = "/getStudentsDetails", produces = "application/json")
    public ResponseEntity<ResponseDto>getStudentsDetails() {
       // logger.info("Inside the Add Course Price Details method Start {}", coursePriceDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
    //    responseDto.setData( mStudentSerivce.getStudentsDetails());
        logger.info("Get Students Details End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
              
    }
    //if condition ipc elearning::useraccount
  //update data to user db
    @PostMapping(value = "/updateStudentsDetails", produces = "application/json")
    public ResponseEntity<ResponseDto>updateStudentsDetails() {
       // logger.info("Inside the Add Course Price Details method Start {}", coursePriceDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
    //    responseDto.setData( mStudentSerivce.getStudentsDetails());
        logger.info("Update Students Details End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
              
    }

    //update data to user db
    @PostMapping(value = "/addStudentsDetails", produces = "application/json")
    public ResponseEntity<ResponseDto>addStudentsDetails() {
       // logger.info("Inside the Add Course Price Details method Start {}", coursePriceDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
    //    responseDto.setData( mStudentSerivce.getStudentsDetails());
        logger.info("insert Students Details End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
              
    }
}
