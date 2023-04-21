package Day6;

public class Air {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public Air(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info(){
        System.out.println(" Изготовитель " + producer + " Год выпуска " + year + " Длинна " + length + " Вес " + weight + " Объем топлива " +fuel);
    }
    public void fillUp(int aFuel){
        fuel = aFuel + fuel;
    }
//Создаем Сеттыры и Геттеры!!!
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
