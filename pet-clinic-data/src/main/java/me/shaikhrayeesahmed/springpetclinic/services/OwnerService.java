package me.shaikhrayeesahmed.springpetclinic.services;

import me.shaikhrayeesahmed.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
