package Day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String predmet;

    public Teacher(String fio, String predmet) {
        this.fio = fio;
        this.predmet = predmet;
    }

    //Сеттеры

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
    //

    public void ocenka (Student student){
        Random random = new Random();
        int randomOc = random.nextInt(4) + 2;

        String ocenka = "";
        switch(randomOc){
            case 2:
                ocenka = "Плохо";
                break;
            case 3:
                ocenka = "Средне";
                break;
            case 4:
                ocenka = "Хорошо";
                break;
            case 5:
                ocenka = "Отлично";
                break;
        }
        System.out.println(" Преподователь " + this.fio + " оценил студента с именем " + student.getFio() + " по предмету " + this.predmet + " на оценку " + ocenka);
    }

}
