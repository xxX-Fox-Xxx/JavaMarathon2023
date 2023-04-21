package Day6;

public class Taks2 {

    public static void main(String[] args) {

        Air air = new Air("Russia",2018,100,10);
        air.setYear(1994);
        air.setLength(80);
        air.fillUp(1000);
        air.fillUp(10000);
        air.info();
    }
}
