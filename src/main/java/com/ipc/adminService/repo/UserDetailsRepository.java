package com.ipc.adminService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipc.adminService.entity.UserEntity;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserEntity, String> {

}
