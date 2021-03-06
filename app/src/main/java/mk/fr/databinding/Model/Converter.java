package mk.fr.databinding.Model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import mk.fr.databinding.BR;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter extends BaseObservable {

    private Double euro;
    private Double yen;



    public Converter() {
    }

    public Converter(Double euro, Double yen) {
        this.euro = euro;
        this.yen = yen;
    }

    @Bindable
    public String getEuro() {
        return String.valueOf(euro);
    }

    public Converter setEuro(String euro) {
        if(! euro .equals("")) {
            this.euro = Double.valueOf(euro);
            this.yen = this.euro * 135.788;
        }else{
            this.yen=0.0;
        }
        //Notifie que la vue doit être changer
        notifyPropertyChanged(BR.yen);
        return this;
    }

    @Bindable
    public String getYen() {
        return String.valueOf(this.yen);

    }


    public Converter setYen(String yen) {
        this.yen = Double.valueOf(yen);

        return this;
    }
}


