package Theme5;

public class Singer {

    private String name;
    private String text;

    public Singer(String name, String text) {
        setName(name);
        setText(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void sing(){
        System.out.println(getName() + ": " + getText());
    }
}
