public class Human {

    private String name;
    private int height;

    public Human(String name, int height) {
        setName(name);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        if(getHeight() < 180)
        {
            if(getHeight()<140)
            {
                return getName() + " маленький человек";
            }
            else return getName() + " средний человек";
        }
        else return getName() + " высокий человек";
    }
}
