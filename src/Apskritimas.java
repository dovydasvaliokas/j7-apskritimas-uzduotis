public class Apskritimas {
    private double spindulys;

    public Apskritimas(double spindulys) {
        if (spindulys >= 0) {
            this.spindulys = spindulys;
        }
        else {
            System.out.println("Spindulys negali būti neigiamas.");
            spindulys = 0;
        }
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
        if (spindulys >= 0) {
            this.spindulys = spindulys;
        }
        else {
            System.out.println("Spindulys negali būti neigiamas. Spindulio reikšmė nebuvo pakeista.");
        }
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }
}
