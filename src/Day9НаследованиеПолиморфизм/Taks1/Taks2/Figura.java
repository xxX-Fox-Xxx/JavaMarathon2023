package Day9НаследованиеПолиморфизм.Taks1.Taks2;

public abstract class Figura {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//Два абстрактных метода
    public abstract int area();

    public abstract int perimeter();

}
