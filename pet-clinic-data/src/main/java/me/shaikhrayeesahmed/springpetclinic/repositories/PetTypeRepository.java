package me.shaikhrayeesahmed.springpetclinic.repositories;

import me.shaikhrayeesahmed.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
