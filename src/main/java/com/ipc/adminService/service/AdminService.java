package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    // To Add Course & Price Details
    String addCoursePriceDetails(CoursePriceDto coursePriceDto);
}
