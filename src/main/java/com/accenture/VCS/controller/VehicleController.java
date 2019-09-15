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

import com.accenture.VCS.exception.VehicleNotFoundException;
import com.accenture.VCS.model.VehicleEntity;
import com.accenture.VCS.repository.VehicleRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/vehicleDetails")
public class VehicleController {

	private VehicleRepository vehicleRepository;

	VehicleController(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	// Insert Employee
	@PostMapping("/add")
	public VehicleEntity create(@RequestBody VehicleEntity vehicleEntity) {
		return vehicleRepository.save(vehicleEntity);
	}
	
	/* Get all Employees */
	@GetMapping
	List<?> findAll() {
		return vehicleRepository.findAll();
	}

	// Get Employee by ID
	@GetMapping("/{id}")
	public VehicleEntity retrieveVehicle(@PathVariable long id) {
		Optional<VehicleEntity> vehicle = vehicleRepository.findById(id);

		if (!vehicle.isPresent())
			 throw new VehicleNotFoundException();
		return vehicle.get();
	}
	

}
