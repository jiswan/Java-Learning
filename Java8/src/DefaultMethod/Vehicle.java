public interface Vehicle {
    void startVehicle();
    default void horn() // default method 
    {
        System.out.println(" Vehicle horn....");
    }
}