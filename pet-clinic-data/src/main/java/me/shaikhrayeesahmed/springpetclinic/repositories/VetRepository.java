package me.shaikhrayeesahmed.springpetclinic.repositories;

import me.shaikhrayeesahmed.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
