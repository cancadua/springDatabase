package com.backend.springdatabase.repositories;

import com.backend.springdatabase.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
