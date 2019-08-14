package Theme2.Task3;

public class Employee {

    private String name;
    private Departament dep;

    public Employee(String name, Departament dep) {
        setName(name);
        setDep(dep);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament getDep() {
        return dep;
    }

    public void setDep(Departament dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return name + " работает в отделе " + dep.getName() + ", начальник которого " + dep.getChief().getName();
    }
}
