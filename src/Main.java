import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Trans.Bus;
import Trans.PassCar;
import Trans.Truck;

public class Main {
    public static void main(String[] args) {

        PassCar passCar1 = new PassCar("BMW", "", 3.8F);
        PassCar passCar2 = new PassCar("Audi", "A6", 3.8F);
        PassCar passCar3 = new PassCar("Mercedes", "S100", 3.8F);
        PassCar passCar4 = new PassCar("Nissan", "Patrol", 3.8F);

        Truck truck1 = new Truck("BMW", "", 3.8F);
        Truck truck2 = new Truck("Audi", "A6", 3.8F);
        Truck truck3 = new Truck("Mercedes", "S100", 3.8F);
        Truck truck4 = new Truck("Nissan", "Patrol", 3.8F);

        Bus bus1 = new Bus("BMW", "", 3.8F);
        Bus bus2 = new Bus("Audi", "A6", 3.8F);
        Bus bus3 = new Bus("Mercedes", "S100", 3.8F);
        Bus bus4 = new Bus("Nissan", "Patrol", 3.8F);

        DriverB ivan = new DriverB("Иван",true,20);
        DriverB petr = new DriverB("Петр",false,20);
        DriverC sasha = new DriverC("Саша",false,20);
        DriverD masha = new DriverD("Маша",true,3);

        ivan.drive(passCar1);
        petr.drive(passCar2);
        sasha.drive(truck1);
        ivan.stopMoving();
        masha.startMoving();
        sasha.stopMoving();

        passCar1.maxSpeed(120);
        bus1.maxSpeed(60);

        passCar1.PitStop();
        bus1.PitStop();
        truck1.PitStop();

        truck1.bestLoop(5);

        System.out.println(passCar1.toString());
    }
}