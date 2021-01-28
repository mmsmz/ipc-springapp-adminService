package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.UserDto;
import com.ipc.adminService.entity.CoursePriceEntity;
import com.ipc.adminService.entity.UserEntity;
import com.ipc.adminService.repo.CoursePriceRepository;
import com.ipc.adminService.repo.UserDetailsRepository;

import com.ipc.adminService.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MStudentServiceImpl  implements  MStudentSerivce{

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(MStudentServiceImpl.class);

    @Autowired
    UserDetailsRepository userDetailsRepository;

	@Override
	public List<UserDto> getStudentsDetails() {
		List<UserDto> studentDetailsList = new ArrayList<>();
		List<UserEntity> userEntityList = userDetailsRepository.findAll();
		for (UserEntity userEntity : userEntityList) {
			UserDto userDto = new UserDto();
			userDto.setUserId(userEntity.getUserId());
			userDto.setNicNr(userEntity.getNicnr());
			userDto.setMobile(userEntity.getMobile());
			userDto.setLoginStatus(userEntity.getLoginstatus());
			userDto.setFirstName(userEntity.getFirstName());
			userDto.setLastName(userEntity.getLastName());
			userDto.setEmail(userEntity.getEmail());
			userDto.setDate(userEntity.getDate());
			userDto.setInstitutebranch(userEntity.getInstituteBranch());
			userDto.setDate(userEntity.getDate());
			if (userEntity.getUserType().equals("student")) {
				studentDetailsList.add(userDto);
			}

		}
		return studentDetailsList;
	}


	@Override
	public String addStudentsDetails(UserDto userDto) {
		try {
			UserEntity userEntity = new UserEntity();
			userEntity.setEmail(userDto.getEmail());
			userEntity.setFirstName(userDto.getFirstName());
			userEntity.setInstituteBranch(userDto.getInstitutebranch());
			userEntity.setLastName(userDto.getLastName());
			userEntity.setLoginstatus(userDto.getLoginStatus());
			userEntity.setMobile(userDto.getMobile());
			userEntity.setUserId(userDto.getUserId());
			userEntity.setUserType(userDto.getUsertype());
			userEntity.setDate(userDto.getDate());
			userEntity.setNicnr(userDto.getNicNr());
			userEntity.setUseraccounttype(userDto.getUseraccounttype());
			userDetailsRepository.save(userEntity);
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



    



}



