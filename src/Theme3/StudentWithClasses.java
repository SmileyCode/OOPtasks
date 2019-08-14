package Theme3;

public class StudentWithClasses {

    private String name;
    private String[] lessons;
    private int[] marks;

    public StudentWithClasses(String name, String[] lessons, int[] marks) {
        setName(name);
        setLessons(lessons);
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setClass(int index, String newLesson, int newMark){
        getMarks()[index] = newMark;
        getLessons()[index] = newLesson;
    }

    public void showMarks(){
        System.out.println(getName()+":");
        for (int i = 0; i < getLessons().length; i++) {
            System.out.println("    "+getLessons()[i]+":"+getMarks()[i]);
        }
    }
}
