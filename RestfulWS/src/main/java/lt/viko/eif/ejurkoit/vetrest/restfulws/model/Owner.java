package lt.viko.eif.ejurkoit.vetrest.restfulws.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

/**
 * Represents a main  object
 */

public class Owner {

    protected String name;

    protected String lastname;

    protected Specialist specialist;

    protected List<Animal> animals;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     *
     * @param name String owners name
     * @param lastname String last name
     * @param specialist Class of specialist
     * @param animals Class list of animals
     */
    public Owner(String name, String lastname, Specialist specialist, List<Animal> animals) {
        this.name = name;
        this.lastname = lastname;
        this.specialist = specialist;
        this.animals = animals;
    }

    public Owner() {
    }

}
