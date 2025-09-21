public class Bike implements Vehicle{
    @Override
    public  void startVehicle()
    {
        System.out.println(" Bike Engine Staered");
    }

    @Override // default method override 
    public void horn()
    {
        System.out.println("Bike horn lets out a high-pitched beep. ");
    }

}
