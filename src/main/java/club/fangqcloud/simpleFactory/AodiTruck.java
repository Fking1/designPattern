package club.fangqcloud.simpleFactory;

public class AodiTruck implements Truck{
    @Override
    public void run() {
        System.out.println("奥迪卡车启动");
    }
}
