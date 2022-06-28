import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airport {

    private List<Planes> planes = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();

    public Airport(List<Planes> planes, List<Flight> flights) {
        this.planes = planes;
        this.flights = flights;
    }

    public List<Flight> getFreeFlights(String pointA, String pointB) {
        List<Flight> flights = new ArrayList<>();
        for (Flight f: this.flights) {
            if (f.getPointA().equals(pointA)&&f.getPointB().equals(pointB)){
                flights.add(f);
            }
        }
        return flights;
    }

    public List<Flight> getAllFlightsAll(String pointA) {
        List<Flight> list = new ArrayList<>();
        for (Flight f: this.flights){
            if (f.getPointA().equals(pointA)) {
                list.add(f);
            }
        }
        return list;
    }

    public List<Flight> getPointBFlights(String pointB) {
        List<Flight> list1 = new ArrayList<>();
        for (Flight f: this.flights){
            if (f.getPointB().equals(pointB)) {
                list1.add(f);
            }
            for (Flight s : list1) {
                System.out.println(s);
            }
        }
        return list1;
    }
}
