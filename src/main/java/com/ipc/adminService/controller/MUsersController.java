package com.ipc.adminService.controller;

import com.ipc.adminService.service.MStudentSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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



}
