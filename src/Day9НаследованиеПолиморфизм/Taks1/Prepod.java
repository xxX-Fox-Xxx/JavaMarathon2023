package Day9НаследованиеПолиморфизм.Taks1;

public class Prepod extends Human {

    private String namePredmet;

    public Prepod(String namePredmet,String name) {
        this.setNamePredmet(namePredmet);
        super.setName(name);
    }

    public String getNamePredmet() {
        return namePredmet;
    }

    public void setNamePredmet(String namePredmet) {
        this.namePredmet = namePredmet;
    }

    @Override
    public void printInfo(){
        System.out.println(" Этот преподователь с именем " + getName());
    }
}
