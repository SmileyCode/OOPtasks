public class ManWithName {

    private String name;
    private String secondName;//otchestvo
    private String lastName;

    public ManWithName(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return (lastName != null ? lastName + " " : "") + (name != null ? name + " " : "") + (secondName != null ? secondName : "");
    }
}
