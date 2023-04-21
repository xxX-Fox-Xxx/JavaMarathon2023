package Day2;

import java.util.Scanner;

public class Taks1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер этажа");
        int kolvoEtag = scanner.nextInt();

        if(kolvoEtag >=1 && kolvoEtag <=4){
            System.out.println("Малоэтажный дом");
        }
        else if(kolvoEtag >= 5 && kolvoEtag <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else if(kolvoEtag >=9){
            System.out.println("Многоэтажный дом");
        }
        else{
            System.out.println("Ввод неверный");
        }

    }
}
