package Theme3.Task5;

import java.util.ArrayList;

public class Floor {

    private ArrayList<Flat> flats;

    public Floor(){
        this.flats = new ArrayList<>();
    }

    public Floor(ArrayList<Flat> flats) {
        this.flats = flats;
    }

    public ArrayList<Flat> getFlats() {
        return flats;
    }

    public void setFlats(ArrayList<Flat> flats) {
        this.flats = flats;
    }

    public void addFlat(Flat flat){
        this.flats.add(flat);
    }

    public void getArea(){//4.7
        int temp = 0;
        for(Flat i : flats){
            temp += i.getArea();
        }
        System.out.println(temp);
    }

    public void getFlatNumbers(){//4.7
        for (int i = 0; i < getFlats().size(); i++) {
            System.out.print(getFlats().get(i).getNumber() + " ");
        }
        System.out.println();
    }

    public void printInfo(int j){
        for (int i = 0; i < getFlats().size(); i++) {
            System.out.println("    " + getFlats().get(i).getNumber() + " квартира, площадь = " + getFlats().get(i).getArea());
        }
    }


}
