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

    /**
     * Apskaičiuoja apskritimo plotą
     * @return plotas
     */
    public double plotas() {
        return Math.PI * Math.pow(spindulys, 2);
    }

    /**
     * Apskaičiuoja apskritimo ilgį.
     * @return
     */
    public double ilgis() {
        return 2 * Math.PI * spindulys;
    }

    /**
     * Grąžina visus apskritimo skaičiavimus (skersmuo, plotas, ilgis) bendrai suformatuotai į vieną tekstą
     * @return String suformatuotą tekstą
     */
    public String skaiciavimaiToString() {
        return "Skersmuo (d) = " + skersmuo() + "\n" +
                "Plotas (S) = " + plotas() + "\n" +
                "Ilgis (C) = " + ilgis();
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
