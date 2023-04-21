package Day3;

import java.util.Scanner;

public class Taks1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город");

        while (true){
        String sity = scanner.next();

        if(sity.equals("Stop"))
            break;

        switch (sity){
            case "Москва":
            case "Ростов":
            case "Владивосток":
                System.out.println("РОССИЯ");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
            System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
            System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
            System.out.println("Германия");
                 break;
            default:
                System.out.println("Неизвестная срана");
        }
        }

    }
}
