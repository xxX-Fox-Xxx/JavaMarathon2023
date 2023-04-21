package Day5;

//У класса могут быть:
//1.Данные(поля)!!!
//2.Действия которые он может совершать(Методы)!!!

//Модификаторы доступа:
//Public,private,protected,default(в пределах этого пакета)!!!

public class Taks1 {

    public static void main(String[] args) {

        Car car = new Car();
        car.setCvet("Blue");
        car.setGodVipuska(Integer.parseInt("2013"));
        car.setModel("Priora");

        System.out.println(" car: " +  " цвет " + car.getCvet() + " Год выпуска " + car.getGodVipuska() + " Модель " + car.getModel());

    }
}