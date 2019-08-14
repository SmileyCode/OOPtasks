package Theme5;

import Theme2.Line;

import java.util.ArrayList;

public class BrokenLine {

    private ArrayList<Line> lines;

    public BrokenLine() {
        setLines(new ArrayList<>());
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public void addLine(Line line){
        this.lines.add(line);
    }

    public void addLine(ArrayList<Line> lines){
        this.lines.addAll(lines);
    }

    public double length(){
        double res = 0;
        for (int i = 0; i < getLines().size(); i++) {
            res += getLines().get(i).length();
        }
        return res;
    }


}
