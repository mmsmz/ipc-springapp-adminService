package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.UserDto;
import com.ipc.adminService.entity.CoursePriceEntity;
import com.ipc.adminService.repo.CoursePriceRepository;
import com.ipc.adminService.util.CommonConstant;

import java.util.ArrayList;
import java.util.List;

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
    CoursePriceRepository coursePriceRepository;

    // To Add Course & Price Details
    @Override
    public String addCoursePriceDetails(CoursePriceDto coursePriceDto) {
        try {
            CoursePriceEntity coursePriceEntity = new CoursePriceEntity();
            coursePriceEntity.setSubjectName(coursePriceDto.getSubjectName());
            coursePriceEntity.setSubjectCategory(coursePriceDto.getSubjectCategory());
            coursePriceEntity.setPrice(coursePriceDto.getPrice());
            coursePriceRepository.save(coursePriceEntity);
            return CommonConstant.SUCCESSFULLY;

        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }
    


	@Override
	public UserDto addUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
    // To get Course & Price Details
	@Override
	public List<CoursePriceDto> getCoursePriceDetails() {
		List<CoursePriceDto> coursePriceList=new ArrayList<>();
		List<CoursePriceEntity>coursePriceEntityList = coursePriceRepository.findAll();
		for(CoursePriceEntity coursePriceEntity:coursePriceEntityList) {
			CoursePriceDto coursePriceDto = new CoursePriceDto();
			coursePriceDto.setCoursePriceId(coursePriceEntity.getCoursePriceId());
			coursePriceDto.setSubjectName(coursePriceEntity.getSubjectName());
			coursePriceDto.setPrice(coursePriceEntity.getPrice());
			coursePriceDto.setSubjectCategory(coursePriceEntity.getSubjectCategory());
			coursePriceList.add(coursePriceDto);
			
		}
	
		return coursePriceList;
		}

}
