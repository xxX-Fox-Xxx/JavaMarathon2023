package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Taks1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLenght];

        for(int i = 0; i<array.length; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println(arrayLenght);

        int array8 = 0;
        for (int i = 0; i < arrayLenght; i++){
            if (array[i]>8)
                array8++;}
            System.out.println(array8);

            int array1 = 0;
            for (int i = 0; i < arrayLenght; i++) {
                if (array[i]==1)
                    array1++;}
                System.out.println(array1);

                int arrayChet = 0;
                for (int i = 0; i < arrayLenght; i++) {
                    if (array[i] % 2 == 0)
                        arrayChet++;}
                    System.out.println(arrayChet);

                    int arrayNechet = 0;
                    for (int i = 0; i < arrayLenght; i++) {
                        if (array[i] % 2 != 0)
                            arrayNechet++;}
                        System.out.println(arrayNechet);

                    int sum = 0;
        for (int i = 0; i < arrayLenght; i++) {
            sum += array[i];

        }
        System.out.println(sum);
    }
}
