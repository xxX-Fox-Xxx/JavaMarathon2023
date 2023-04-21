package Day9НаследованиеПолиморфизм.Taks1.Taks2;

public class Pramougolnik extends Figura{

    private int shirina, visota;

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }

    public Pramougolnik(String color, int shirina, int visota){
        super.setColor(color);
        this.setShirina(shirina);
        this.setVisota(visota);
    }


    @Override
    public int area() {
        return shirina * visota;
    }

    @Override
    public int perimeter() {
        return 2* (shirina + visota);
    }
}
