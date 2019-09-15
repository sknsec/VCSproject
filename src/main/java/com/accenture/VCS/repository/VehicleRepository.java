package com.accenture.VCS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.VCS.model.VehicleEntity;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

}
