package oops;

public class BMWCar extends Car{
    @Override
    int carEngineCC() {
        return 1600;
    }

    public static void main(String[] args) {
        BMWCar obj = new BMWCar();

    }
}
