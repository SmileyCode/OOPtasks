package Theme3;

import java.util.Arrays;

//3.2
public class StudentWithMarks {

    private String name;
    private int[] marks;

    public StudentWithMarks(String name, int[] marks) {
        setName(name);
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double median(){//4.8
        double res = 0;
        for (int i = 0; i < getMarks().length; i++) {
            res += marks[i];
        }
        res = res / getMarks().length;
        return res;
    }

    public String onlyGoods(){//4.8
        for (int i = 0; i < getMarks().length; i++) {
            if(getMarks()[i] != 5)
                return "Студент не отличник";
        }
        return "Студент отличник";
    }

    @Override
    public String toString() {
        return getName() + ":" + Arrays.toString(getMarks());
    }
}
