package Day8;

public class Taks1 {

    public static void main(String[] args) {

        String numbers = "";

        long befor = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++)
            numbers = numbers + i + " ";
        long after = System.currentTimeMillis();
        System.out.println(" Время вывода: " + (after - befor));
        System.out.println(numbers);

        StringBuilder sb = new StringBuilder("");

        befor = System.currentTimeMillis();
        for(int i = 0;i<=20000;i++)
            sb.append(i).append(" ");
        after = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println(" Время вывода кода: " + (after - befor));
    }
}
