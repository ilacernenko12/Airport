import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Planes airPlane1 = new Planes("Boeing", "1111",45);
        Planes airPlane2 = new Planes("Airbus", "112", 50);
        Planes airPlane3 = new Planes("Boeing", "113", 100);

        Flight race1 = new Flight(airPlane1, "Moscow", "New-York", "12");
        Flight race2 = new Flight(airPlane1, "Moscow", "Minsk", "20");
        Flight race3 = new Flight(airPlane2, "Minsk", "Kishinev", "12");
        Flight race4 = new Flight(airPlane2, "Kishinev", "Minsk", "17");
        Flight race5 = new Flight(airPlane3, "Grodno", "Vilnius", "8");

        List<Planes> planes = new ArrayList<>();
        planes.add(airPlane1);
        planes.add(airPlane2);
        planes.add(airPlane3);

        List<Flight> fly = new ArrayList<>();
        fly.add(race1);
        fly.add(race2);
        fly.add(race3);
        fly.add(race4);
        fly.add(race5);

        Airport airport = new Airport(planes, fly);
  /*  List<Flight> list = airport.getFreeFlights("Moscow", "Minsk");
        if (!list.isEmpty()) {
            System.out.println(list);
        } else {
            System.out.println("No flights");
        }

    List<Flight> list1 = airport.getAllFlightsAll("Moscow");
        if (!list1.isEmpty()) {
            System.out.println(list1);
        } else {
            System.out.println("No flights");
        }*/

        List<Flight> list2 = airport.getPointBFlights("Minsk");
        if (!list2.isEmpty()) {
            System.out.println(list2);
        } else {
            System.out.println("No flights");
        }
    }
}
