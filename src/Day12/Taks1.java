package Day12;

import java.util.ArrayList;
import java.util.List;

 public class Taks1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        list.add("Toyota");

        System.out.println(list);

        list.add(2,"Shkoda");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
