package com.veterinary.followup.service;

import com.veterinary.followup.dto.PatientRegistrationDto;
import com.veterinary.followup.model.Patient;
import com.veterinary.followup.model.User;
//import com.veterinary.followup.web.dto.PatientRegistrationDto;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> getPatients();

    Patient findByName_AndOwner(String name, User owner);

    Optional<Patient> findById(Long id);

    Patient save(PatientRegistrationDto registration, User owner);

    void update(PatientRegistrationDto registration, Patient patient);

    void deleteById(Long id);

    List<Patient> findByNameContainingIgnoreCase(String name);
}
