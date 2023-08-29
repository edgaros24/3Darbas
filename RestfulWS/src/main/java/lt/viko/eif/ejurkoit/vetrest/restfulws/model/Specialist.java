package lt.viko.eif.ejurkoit.vetrest.restfulws.model;

/**
 * Represents a specialist for animals
 * @author Edgar
 * @see Owner
 * @since 1.0
 */
public class Specialist {
    protected String Name;
    protected String Lastname;
    protected String specialization;

    /**
     *
     * @param name String name of specialist
     * @param lastname String last name
     * @param specialization String specialization of specialist
     */
    public Specialist(String name, String lastname, String specialization) {
        this.Name = name;
        this.Lastname = lastname;
        this.specialization = specialization;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Specialist() {
    }
}
