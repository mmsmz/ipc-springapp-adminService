package com.ipc.adminService.repo;

import com.ipc.userservice.user.entity.CoursePriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursePriceRepository extends JpaRepository<CoursePriceEntity, String> {

}