package me.shaikhrayeesahmed.springpetclinic.bootstrap;

import me.shaikhrayeesahmed.springpetclinic.model.Owner;
import me.shaikhrayeesahmed.springpetclinic.model.Pet;
import me.shaikhrayeesahmed.springpetclinic.model.PetType;
import me.shaikhrayeesahmed.springpetclinic.model.Vet;
import me.shaikhrayeesahmed.springpetclinic.services.OwnerService;
import me.shaikhrayeesahmed.springpetclinic.services.PetTypeService;
import me.shaikhrayeesahmed.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType savedCatPetType  = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("weston");
        owner1.setTelephone("123");
        owner1.setAddrress("btm banglore");
        owner1.setCity("bengaluru");

        Pet pet1 = new Pet();
        pet1.setPetType(dog);
        pet1.setName("Dicky");
        pet1.setOwner(owner1);

        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glanne");
        owner2.setTelephone("123");
        owner2.setAddrress("btm banglore");
        owner2.setCity("bengaluru");

        Pet pet2 = new Pet();
        pet2.setPetType(cat);
        pet2.setName("Chicky");
        pet2.setOwner(owner2);

        owner1.getPets().add(pet2);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");


    }
}
