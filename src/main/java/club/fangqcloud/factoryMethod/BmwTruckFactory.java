package club.fangqcloud.factoryMethod;

public class BmwTruckFactory implements TruckFactory{
    @Override
    public Truck produceTruck() {
        return new BmwTruck();
    }
}
