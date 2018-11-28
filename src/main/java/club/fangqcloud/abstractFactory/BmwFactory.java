package club.fangqcloud.abstractFactory;

public class BmwFactory implements CarFactory {
    @Override
    public Truck produceTruck() {
        return new BmwTruck();
    }

    @Override
    public Saloon produceSaloon() {
        return new BmwSaloon();
    }
}
