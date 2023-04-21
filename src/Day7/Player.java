package Day7;

public class Player {

    private int stamaina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN = 0;
//Создаем статическое поле для всех игроков
    public static int countPlayer;

    public Player(int stamaina) {
        this.stamaina = stamaina;


        if (countPlayer < 6)
            countPlayer++;

    }
        public void run() {

            if(stamaina == 0)
                return;

            stamaina--;

            if (stamaina == 0)
                countPlayer--;
    }

    public static void info(){
        if(countPlayer<6){
            System.out.println(" Команды неполные, еще есть " + (6 - countPlayer) + " свободных мест ");
        }
        else{
            System.out.println("Мест больше нет");
        }
    }

}
