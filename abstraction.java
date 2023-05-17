abstract class Vehicle{
  abstract void property();
}
class Bike extends Vehicle{
    void property()
    {
        System.out.println("This is Bike:");
    }
}

class Car extends Vehicle{
    void property()
    {
        System.out.println("This is Car:");
    }
}
class Main{
    public static void main(String args[])
    {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.property();
        v2.property();
    }
}
