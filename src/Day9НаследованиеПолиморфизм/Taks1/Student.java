package Day9НаследованиеПолиморфизм.Taks1;

public class Student extends Human {

    public Student (String nameGrupa, String name) {
        this.setNameGrupa(nameGrupa);
        super.setName(name);
    }

    private String nameGrupa;


    public String getNameGrupa() {
        return nameGrupa;
    }

    public void setNameGrupa(String nameGrupa) {
        this.nameGrupa = nameGrupa;
    }

    @Override
    public void printInfo(){
        System.out.println(" Этот студент с именем " + getName());


    }

}
