package Theme3.Task5;

import java.util.ArrayList;

public class Building {
    private ArrayList<Floor> floors;

    public Building() {
        this.floors = new ArrayList<>();
    }

    public Building(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public void addFloor(Floor floor){
        this.floors.add(floor);
    }

    public void findFlat(int number){//4.7
        for (int i = 0; i < getFloors().size(); i++) {
            for (int j = 0; j < getFloors().get(i).getFlats().size(); j++) {
                if(getFloors().get(i).getFlats().get(j).getNumber() == number)
                    System.out.println(getFloors().get(i).getFlats().get(j).getArea());
            }
        }
    }

    public void printInfo(){
        for (int i = 0; i < getFloors().size(); i++) {
            System.out.println(i + " этаж");
            getFloors().get(i).printInfo(i);
        }
    }
}
