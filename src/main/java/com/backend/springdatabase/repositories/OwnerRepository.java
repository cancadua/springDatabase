package com.backend.springdatabase.repositories;

import com.backend.springdatabase.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
