package VendingMachine;

public class NaslednikHot extends HotDrink{
    private int volume;
    private int temperature;
    public NaslednikHot(String name, int cost, int volume, int temperature) {
        super.(name, cost);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "NaslednikHot{" +
                 "name = " + this.getName() +
                ";volume = " + volume +
                ";cost = " + this.getCost() +
                ";temperature = " + getTemperature() +
                '}';
    }
}

