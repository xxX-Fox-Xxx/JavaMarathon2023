package Day7;

public class Taks2 {

    public static void main(String[] args) {

        Player palayer1 = new Player(90);
        Player palayer2 = new Player(95);
        Player palayer3 = new Player(93);
        Player palayer4 = new Player(40);
        Player palayer5 = new Player(80);
        Player.info();
        Player palayer6 = new Player(70);

        Player palayer7 = new Player(100);
        Player.info();

        for(int i=0; i<91; i++){
            palayer3.run();

        }

    }
}
