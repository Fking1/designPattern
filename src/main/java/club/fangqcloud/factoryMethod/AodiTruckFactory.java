package club.fangqcloud.factoryMethod;

public class AodiTruckFactory implements TruckFactory{
    @Override
    public Truck produceTruck() {
        return new AodiTruck();
    }
}
