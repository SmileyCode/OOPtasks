public class ManWithDad extends ManWithName{

    public ManWithDad(String name, String lastName) {
        super(name);
        super.setLastName(lastName);
    }

    public void setFather(ManWithName father) {
        super.setSecondName(father.getName() + "ович");
    }
}
