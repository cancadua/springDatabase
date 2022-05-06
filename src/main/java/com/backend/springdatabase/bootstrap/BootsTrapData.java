package com.backend.springdatabase.bootstrap;

import com.backend.springdatabase.Owner;
import com.backend.springdatabase.Pet;
import com.backend.springdatabase.repositories.OwnerRepository;
import com.backend.springdatabase.repositories.PetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootsTrapData implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;

    public BootsTrapData(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner adi = new Owner("Adrian", "Galus");
        Pet kit = new Pet("Kitku");
        adi.getPets().add(kit);
        kit.getOwners().add(adi);

        ownerRepository.save(adi);
        petRepository.save(kit);

        Owner mati = new Owner("Mati", "Mateusz");
        Pet dog = new Pet("Pjes");
        mati.getPets().add(dog);
        dog.getOwners().add(mati);

        ownerRepository.save(mati);
        petRepository.save(dog);
        System.out.println("Started in Bootstrap");
        System.out.println("Pets: " + petRepository.count());
    }
}
