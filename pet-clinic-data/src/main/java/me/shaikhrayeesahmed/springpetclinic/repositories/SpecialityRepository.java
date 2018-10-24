package me.shaikhrayeesahmed.springpetclinic.repositories;

import me.shaikhrayeesahmed.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
