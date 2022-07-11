public class Apskritimas {
    private double spindulys;

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public Apskritimas() {
    }

    /**
     * Apskaičiuoja apskritimo skersmenį
     * @return dvigubą spindulį
     */
    public double skersmuo() {
        return spindulys * 2;
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
