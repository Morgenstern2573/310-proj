import java.util.*;

class moveVehicle implements Runnable {
    private Vehicle vehicle;
    private VehicleTracker tracker;

    moveVehicle(Vehicle vehicle, VehicleTracker tracker) {
      this.vehicle = vehicle;
      this.tracker = tracker;
    }

    private void move() {
      Random random = new Random();

      this.tracker.setLocation(this.vehicle.getId(), random.nextInt(5000), random.nextInt(5000));
      // update logic with tracker and random numbers
    }

    private void render() {
        System.out.println(this.vehicle.getId() + " is at position: " + (tracker.getLocation(this.vehicle.getId())).toString());
    
    }

    public void run () {
      while (true) {
        this.move();
        this.render();
      }
    }
  }