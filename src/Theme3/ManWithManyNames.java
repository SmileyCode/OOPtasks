package Theme3;

public class ManWithManyNames {
    private String[] name;
    private String secondName;//otchestvo
    private String lastName;

    public ManWithManyNames(String[] name, String lastName) {
        setName(name);
        setLastName(lastName);
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
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


    public void setFather(ManWithManyNames father) {
        setSecondName(father.getName()[0] + "ович");
    }

    @Override
    public String toString() {
        String res = (getLastName() != null ? getLastName() + " " : "");

        if(name != null){
            for (int i = 0; i < getName().length; i++) {
                res += ( getName()[i] + " ");
            }
        }

        res += (getSecondName() != null ? getSecondName() : "");

        return res;
    }

}
