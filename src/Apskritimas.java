public class Apskritimas {
    private double spindulys;

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public Apskritimas() {
    }

    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        this.spindulys = spindulys;
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }
}
