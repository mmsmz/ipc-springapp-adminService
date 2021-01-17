package com.ipc.adminService.service;

import com.ipc.adminService.dto.CoursePriceDto;
import com.ipc.adminService.dto.UserDto;
import com.ipc.adminService.entity.CoursePriceEntity;
import com.ipc.adminService.entity.UserEntity;
import com.ipc.adminService.repo.CoursePriceRepository;
import com.ipc.adminService.repo.UserDetailsRepository;

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
		List<UserDto> studentDetailsList=new ArrayList<>();
		List<UserEntity>userEntityList = userDetailsRepository.findAll();
		for(UserEntity userEntity:userEntityList) {
			UserDto userDto = new UserDto();
			userDto.setFirstName(userEntity.getFirstName());
			userDto.setLastName(userEntity.getLastName());
			userDto.setEmail(userEntity.getEmail());
			userDto.setInstitutebranch(userEntity.getInstituteBranch());
			studentDetailsList.add(userDto);
			
		}
	
		return studentDetailsList;
		}



	@Override
	public UserDto addUser() {
		// TODO Auto-generated method stub
		return null;
	}



    



}



