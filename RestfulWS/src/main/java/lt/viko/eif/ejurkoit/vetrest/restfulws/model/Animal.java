package lt.viko.eif.ejurkoit.vetrest.restfulws.model;

/**
 * Represents the animals list
 * @author edgar
 * @see Owner
 * @since 1.0
 */
public class Animal {
    protected String name;
    protected String gender;
    protected String type;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Animal() {

    }

    public Animal(String name, String gender, String type) {
        this.name = name;
        this.gender = gender;
        this.type = type;
    }

}
