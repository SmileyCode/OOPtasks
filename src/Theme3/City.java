package Theme3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//3.6
public class City {

    private String name;
    private Map<City, Integer> traces;

    public City(String name) {
        this.name = name;
        traces = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<City, Integer> getTraces() {
        return traces;
    }

    public void setTraces(Map<City, Integer> traces) {
        this.traces = traces;
    }

    public void addTrace(City city, int cost){
        this.traces.put(city,cost);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", traces=" + traces +
                '}';
    }

    public Integer showTraces(City key){
        return getTraces().get(key);
    }
}
