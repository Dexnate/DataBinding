package mk.fr.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mk.fr.databinding.Model.Converter;
import mk.fr.databinding.databinding.ActivityConvertisseurBinding;


public class Convertisseur extends AppCompatActivity {

    private Converter converter;

    private ActivityConvertisseurBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertisseur);

        //Instanciation du model
        converter = new Converter(1.00,135.788);


        //Création d'un objet de liaison(binding)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_convertisseur);

        //Définition des variables à lier
        binding.setConverter(converter) ;
    }
}
