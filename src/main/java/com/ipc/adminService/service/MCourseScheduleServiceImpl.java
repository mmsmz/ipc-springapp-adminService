package com.ipc.adminService.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipc.adminService.dto.CourseScheduleDto;
import com.ipc.adminService.entity.CoursePriceEntity;
import com.ipc.adminService.entity.CourseScheduleEntity;
import com.ipc.adminService.repo.CourseScheduleRepository;
import com.ipc.adminService.repo.UserDetailsRepository;
import com.ipc.adminService.util.CommonConstant;
@Service
public class MCourseScheduleServiceImpl implements  MCourseScheduleService {


	final Logger logger = LoggerFactory.getLogger(MCourseScheduleService.class);
	@Autowired
	CourseScheduleRepository courseScheduleRepository;

   

	@Override
	public String addCourseScheduleDetails(CourseScheduleDto courseScheduleDto) {
		try {
			CourseScheduleEntity courseScheduleEntity = new CourseScheduleEntity();
			courseScheduleEntity.setCourseScheduleId(courseScheduleDto.getCourseScheduleId());
			courseScheduleEntity.setCoursePriceId(courseScheduleDto.getCoursePriceId());
			courseScheduleEntity.setDay(courseScheduleDto.getDay());
			courseScheduleEntity.setTime(courseScheduleDto.getTime());
			courseScheduleRepository.save(courseScheduleEntity);
			return CommonConstant.SUCCESSFULLY;

		} catch (Exception e) {
			logger.info(e.getMessage());
			return e.getMessage();
		}
	}

}
