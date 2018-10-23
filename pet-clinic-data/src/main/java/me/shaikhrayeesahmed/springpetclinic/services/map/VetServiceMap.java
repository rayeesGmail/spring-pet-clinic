package me.shaikhrayeesahmed.springpetclinic.services.map;

import me.shaikhrayeesahmed.springpetclinic.model.Speciality;
import me.shaikhrayeesahmed.springpetclinic.model.Vet;
import me.shaikhrayeesahmed.springpetclinic.services.SpaciatiltyService;
import me.shaikhrayeesahmed.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpaciatiltyService spaciatiltyService;

    public VetServiceMap(SpaciatiltyService spaciatiltyService) {
        this.spaciatiltyService = spaciatiltyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size() > 0){

            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = spaciatiltyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });

        }


        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
