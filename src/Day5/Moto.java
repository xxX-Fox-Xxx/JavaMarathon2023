package Day5;

public class Moto {
    private int godVipuska;
    private String cvet;
    private String model;

    public Moto(int godVipuska, String cvet, String model) {
        this.godVipuska = godVipuska;
        this.cvet = cvet;
        this.model = model;
    }

    public Moto() {

    }

    public int getGodVipuska() {
        return godVipuska;
    }

    public String getCvet() {
        return cvet;
    }

    public String getModel() {
        return model;
    }

}
