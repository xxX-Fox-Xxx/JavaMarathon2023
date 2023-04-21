package Day6;

public class Car {
    private int godVipuska;
    private String cvet;
    private String model;



    public int getGodVipuska () {
        return godVipuska;
    }

    public void setGodVipuska(int godVipuska) {
        this.godVipuska = godVipuska;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void thisCar(){
        System.out.println("Этот Автомобиль");
    }

    public int raznicaGodah(int raznica){
        return  Math.abs(raznica-godVipuska);
    }
}
