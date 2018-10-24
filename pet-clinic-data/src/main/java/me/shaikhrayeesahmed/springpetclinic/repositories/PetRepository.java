package me.shaikhrayeesahmed.springpetclinic.repositories;

import me.shaikhrayeesahmed.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
