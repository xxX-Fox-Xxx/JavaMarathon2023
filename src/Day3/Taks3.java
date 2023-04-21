package Day3;

import java.util.Scanner;

public class Taks3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int r = 0;

        for(int i =r; i<5; i++){

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if(b==0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
