package mk.fr.databinding.Model;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter {

    private Double euro;
    private Double yen;

    public Converter() {
    }

    public Converter(Double euro, Double yen) {
        this.euro = euro;
        this.yen = yen;
    }

    public Double getEuro() {
        return euro;
    }

    public Converter setEuro(Double euro) {
        this.euro = euro;
        return this;
    }

    public Double getYen() {
        return yen;
    }

    public Converter setYen(Double yen) {
        this.yen = yen;
        return this;
    }
}


