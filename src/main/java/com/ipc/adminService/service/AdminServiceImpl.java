package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.entity.CoursePriceEntity;
import com.ipc.adminService.repo.CoursePriceRepository;
import com.ipc.adminService.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService  {
    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    CoursePriceRepository adminRepository;

    // To Add Course & Price Details
    @Override
    public String addCoursePriceDetails(CoursePriceDto coursePriceDto) {
        try {
            CoursePriceEntity coursePriceEntity = new CoursePriceEntity();
            coursePriceEntity.setSubjectName(coursePriceDto.getSubjectName());
            coursePriceEntity.setSubjectCategory(coursePriceDto.getSubjectCategory());
            coursePriceEntity.setPrice(coursePriceDto.getPrice());
            //adminRepository.save(coursePriceEntity);
            return CommonConstant.SUCCESSFULLY;

        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }

}
