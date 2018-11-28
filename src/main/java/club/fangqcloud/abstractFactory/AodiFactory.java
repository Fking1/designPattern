package club.fangqcloud.abstractFactory;

public class AodiFactory implements CarFactory{
    @Override
    public Truck produceTruck() {
        return new AodiTruck();
    }

    @Override
    public Saloon produceSaloon() {
        return new AodiSaloon();
    }
}
