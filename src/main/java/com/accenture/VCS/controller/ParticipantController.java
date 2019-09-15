package com.accenture.VCS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.VCS.exception.ParticipantNotFoundException;
import com.accenture.VCS.model.ParticipantEntity;
import com.accenture.VCS.repository.ParticipantRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/participant")
public class ParticipantController {

	private ParticipantRepository participantRepository;

	ParticipantController(ParticipantRepository participantRepository) {
		this.participantRepository = participantRepository;
	}

	// Insert Employee
	@PostMapping("/add")
	public ParticipantEntity create(@RequestBody ParticipantEntity participantEntity) {
		return participantRepository.save(participantEntity);
	}

	/* Get all Employees */
	@GetMapping
	List<?> findAll() {
		return participantRepository.findAll();
	}

	// Get Employee by ID
	@GetMapping("/{id}")
	public ParticipantEntity retrieveVehicle(@PathVariable long id) {
		Optional<ParticipantEntity> participant = participantRepository.findById(id);

		if (!participant.isPresent())
			throw new ParticipantNotFoundException();
		return participant.get();
	}

}
