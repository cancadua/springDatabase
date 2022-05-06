package com.backend.springdatabase.controllers;

import com.backend.springdatabase.Pet;
import com.backend.springdatabase.repositories.PetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PetController {

    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @RequestMapping("/pets")
    public ResponseEntity<Iterable<Pet>> getAll() {
        return new ResponseEntity<>(petRepository.findAll(), HttpStatus.OK);

    }
}
