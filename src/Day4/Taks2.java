package Day4;

import java.util.Random;


public class Taks2 {
    public static void main(String[] args) {

        int[] arrays = new int[100];

        Random random = new Random();
        for (int i = 0; i < arrays.length; i++)
            arrays[i] = random.nextInt(10000);
//1,4,5,-5,10,15
        int max = 0;
        for (int array : arrays){
            if(array > max)
                max = array;
        }
        System.out.println(max);

        int min = 1000;
        for(int array : arrays){
            if(array < min)
                min = array;
        }
        System.out.println(min);

        int delit = 0;
        for(int array : arrays){
            if(array % 10 == 0)
                delit = array;
        }
        System.out.println(delit);

        int sum = 0;
        for(int array : arrays) {
            if (array % 10 == 0)
                delit += array;
        }

    }

}
