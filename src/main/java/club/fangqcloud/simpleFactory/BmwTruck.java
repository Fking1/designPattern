package club.fangqcloud.simpleFactory;

public class BmwTruck implements Truck{
    @Override
    public void run() {
        System.out.println("宝马卡车启动");
    }
}
