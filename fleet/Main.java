import java.util.*;
import java.util.concurrent.*;

class Main {
  public static void main(String[] args) {
    Vehicle[] fleet = { new Vehicle("Truck"), new Vehicle("Bike 1"), new Vehicle("Bike 2"), new Vehicle("Bike 3"), new Vehicle("Truck 2"), new Vehicle("Delivery Sedan") };
    
    Map <String, Point> startLocations = new HashMap<String, Point>();

    for (int i = 0; i < fleet.length; i++) {
      startLocations.put(fleet[i].getId(), new Point(0,0));
    }
    
    VehicleTracker tracker = new VehicleTracker(startLocations);

    ExecutorService executor = Executors.newCachedThreadPool();

    for (int i = 0; i < fleet.length; i++) {
      executor.execute(new moveVehicle(fleet[i], tracker));
    }

    executor.shutdown();
  }
}