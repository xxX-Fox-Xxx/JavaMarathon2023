package Day9НаследованиеПолиморфизм.Taks1;

public class Task1 {

    public static void main(String[] args) {

        Student student = new Student("41b","Renat");
        Prepod prepod = new Prepod("sopramat","Ivan");
        System.out.println(student.getNameGrupa());
        System.out.println(prepod.getNamePredmet());

        student.printInfo();
        prepod.printInfo();


    }
}
