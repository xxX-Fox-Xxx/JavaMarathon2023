package Day9НаследованиеПолиморфизм.Taks1.Taks2;

public class Treugolnik extends Figura{

    private int dlina1,dlina2,dlina3;

    public int getDlina1() {
        return dlina1;
    }

    public void setDlina1(int dlina1) {
        this.dlina1 = dlina1;
    }

    public int getDlina2() {
        return dlina2;
    }

    public void setDlina2(int dlina2) {
        this.dlina2 = dlina2;
    }

    public int getDlina3() {
        return dlina3;
    }

    public void setDlina3(int dlina3) {
        this.dlina3 = dlina3;
    }

    public Treugolnik(String color, int dlina1, int dlina2, int dlina3){
        super.setColor(color);
        this.setDlina1(dlina1);
        this.setDlina2(dlina2);
        this.setDlina3(dlina3);
    }


    @Override
    public int area() {
        return perimeter()/2;
    }

    @Override
    public int perimeter() {
        return dlina1+dlina2+dlina3;
    }
}
