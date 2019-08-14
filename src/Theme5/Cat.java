package Theme5;

public class Cat {

    private String name;

    public Cat(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mur(){
        System.out.println(getName()+": мяу!");
    }

    public void mur(int count){
        System.out.print(getName()+": ");
        for (int i = 0; i < count-1; i++) {
            System.out.print("мяу-");
        }
        System.out.println("мяу!");
    }

    @Override
    public String toString() {
        return "Кот: " + getName();
    }
}
