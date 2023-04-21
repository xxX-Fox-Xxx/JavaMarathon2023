package Day9НаследованиеПолиморфизм.Taks1.Taks2;

public class TestFigura {

    public static void main(String[] args) {

        Figura[] figuras = {
                new Treugolnik("Red", 10, 10, 10),
                new Treugolnik("Green", 10, 20, 30),
                new Treugolnik("Red", 10, 20, 15),
                new Pramougolnik("Red", 5, 10),
                new Pramougolnik("Orange", 40, 15),
                new Krug("Red", 4),
                new Krug("Red", 10),
                new Krug("Red", 5)
        };
    }

}
