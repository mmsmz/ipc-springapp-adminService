package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import org.springframework.stereotype.Service;

@Service
public interface MCoursePriceService {

    CoursePriceDto updateCoursePriceDetails(CoursePriceDto coursePriceDto);

}
