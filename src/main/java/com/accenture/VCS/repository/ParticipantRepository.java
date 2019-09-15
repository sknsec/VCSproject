package com.accenture.VCS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.VCS.model.ParticipantEntity;

public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Long> {

}
