package Theme2;

public class Line {

    Point start;
    Point end;

    public Line() {
    }

    public Line(Point start, Point end) {
        setStart(start);
        setEnd(end);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length(){//4.3
        return Math.sqrt(Math.pow((getEnd().getX()-getStart().getX()),2) + Math.pow((getEnd().getY()-getStart().getY()),2));
    }

    @Override
    public String toString() {
        return "Линия от " + getStart().toString() + " до " + getEnd().toString();
    }
}
