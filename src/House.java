public class House {

    private int floors;

    public House(int floors) {
        setFloors(floors);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "дом с " + floors + (floors == 1 ? " этажом" : " этажми");
    }
}
