package Day6;

public class Taks1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setGodVipuska(2013);
        car.thisCar();
        System.out.println(car.raznicaGodah(2022));
        Moto moto = new Moto(2000,"blue","bmw");
        moto.thisMoto();
        System.out.println(moto.raznicaGodah(1900));


    }
}
