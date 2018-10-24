package me.shaikhrayeesahmed.springpetclinic.repositories;

import me.shaikhrayeesahmed.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
