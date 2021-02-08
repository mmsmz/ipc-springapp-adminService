package com.ipc.adminService.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ipc.adminService.entity.ImageEntity;



public interface ImageRepository  extends JpaRepository<ImageEntity, String> {
	// Optional<ImageEntity> findByName(String name);
}
