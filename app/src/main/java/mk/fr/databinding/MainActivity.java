package mk.fr.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mk.fr.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Person pinpin;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciation du model
       pinpin = new Person("De Percedal", "Tristepin");

        //Création d'un objet de liaison(binding)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //Définition des variables à lier
        binding.setPerson(pinpin);

    }

    public void onPromote(View view) {
        pinpin.setName("Super Percedal");

    }
}
