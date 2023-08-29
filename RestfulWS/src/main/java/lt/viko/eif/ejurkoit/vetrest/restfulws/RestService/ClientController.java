package lt.viko.eif.ejurkoit.vetrest.restfulws.RestService;

import lt.viko.eif.ejurkoit.vetrest.restfulws.model.Animal;
import lt.viko.eif.ejurkoit.vetrest.restfulws.model.Owner;
import lt.viko.eif.ejurkoit.vetrest.restfulws.model.Specialist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Represents GET method
 */
@RestController
@RequestMapping("/VetData")
public class ClientController {

        @GetMapping
        public String getOwnerInfo() {
            Specialist specialist1 = new Specialist();
            Animal animal1 = new Animal();
            Animal animal2 = new Animal();
            Owner owner1 = new Owner();

            specialist1.setName("Petras");
            specialist1.setLastname("Petraitis");
            specialist1.setSpecialization("Surgeon");

            animal1.setName("Tom");
            animal1.setGender("Male");
            animal1.setType("Dog");

            animal2.setName("Mary");
            animal2.setGender("Female");
            animal2.setType("Dog");

            owner1.setName("Vardenis");
            owner1.setLastname("Pavardenis");
            owner1.setSpecialist(specialist1);
            owner1.setAnimals(List.of(animal1, animal2));

            StringBuilder ownerInfo = new StringBuilder();
            ownerInfo.append("Name: ").append(owner1.getName()).append("\n");
            ownerInfo.append("Last Name: ").append(owner1.getLastname()).append("\n");
            ownerInfo.append("Specialist: ").append(owner1.getSpecialist().getName())
                    .append(" ").append(owner1.getSpecialist().getLastname())
                    .append(" (").append(owner1.getSpecialist().getSpecialization()).append(")\n");

            ownerInfo.append("Animals:\n");

            for (Animal animal : owner1.getAnimals()) {
                ownerInfo.append("  - ").append("Name: ").append(animal.getName())
                        .append(", Gender: ").append(animal.getGender())
                        .append(", Type: ").append(animal.getType()).append("\n");
            }

            return ownerInfo.toString();
        }

}
