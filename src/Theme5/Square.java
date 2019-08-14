package Theme5;

import Theme2.Line;
import Theme2.Point;

public class Square {

    private Point start;
    private int length;

    public Square(Point start, int length) {
        setStart(start);
        setLength(length);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public BrokenLine makeBrokenLine(){
        BrokenLine brokenLine = new BrokenLine();
        brokenLine.addLine(new Line(getStart(),new Point(getStart().getX(),getStart().getY())));
        brokenLine.addLine(new Line(getStart(),new Point(getStart().getX()+length,getStart().getY())));
        brokenLine.addLine(new Line(getStart(),new Point(getStart().getX()+length,getStart().getY()-length)));
        brokenLine.addLine(new Line(getStart(),new Point(getStart().getX(),getStart().getY()-length)));
        return brokenLine;
    }
}
