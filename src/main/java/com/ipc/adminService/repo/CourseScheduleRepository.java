package com.ipc.adminService.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ipc.adminService.entity.CourseScheduleEntity;

public interface CourseScheduleRepository extends JpaRepository<CourseScheduleEntity, String>  {

}
