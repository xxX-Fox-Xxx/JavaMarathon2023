package Day9НаследованиеПолиморфизм.Taks1.Taks2;

public class Krug extends Figura {

    private int radiusOkrugnosti;



    public int getRadiusOkrugnosti() {
        return radiusOkrugnosti;
    }

    public void setRadiusOkrugnosti(int radiusOkrugnosti) {
        this.radiusOkrugnosti = radiusOkrugnosti;
    }



    public Krug (String color, int radiusOkrugnosti){
        super.setColor(color);
        this.setRadiusOkrugnosti(radiusOkrugnosti);
    }

    @Override
    public int area() {
        return radiusOkrugnosti * radiusOkrugnosti;
    }

    @Override
    public int perimeter() {
        return 2 * radiusOkrugnosti;
    }
}
