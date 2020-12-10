package com.ipc.adminService.controller;

import com.ipc.adminService.service.AdminService;
import com.ipc.adminService.service.MStudentSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/mStudentController")
public class MStudentController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(MStudentController.class);

    @Autowired
    MStudentSerivce mStudentSerivce;

    @GetMapping("/admin")
    String admin() {
        return "<h1>Welcome!!!</h1>";
    }


}
