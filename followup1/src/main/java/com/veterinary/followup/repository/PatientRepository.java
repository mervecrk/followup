package com.veterinary.followup.repository;

import com.veterinary.followup.model.Patient;
import com.veterinary.followup.model.User;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {

    Patient findByName_AndOwner(String name, User owner);

    List<Patient> findByNameContainingIgnoreCase(String name);

    List<Patient> findAll();

    Patient save(Patient patient);

    void deleteById(Long id);

    Optional<Patient> findById(Long id);
}
