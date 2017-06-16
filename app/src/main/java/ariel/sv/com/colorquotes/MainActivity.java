package ariel.sv.com.colorquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //nombre del tag para los logs
    public static final String TAG = MainActivity.class.getSimpleName();
    //Nuestros elementos
    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaCitaButton;
    private String[] autores;
    private String[] citas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializando nuestras variables:O
        autores = new String[5];
        citas = new String[5];

        //Variables ligados a nuestra UI:3
        citaTextView = (TextView)this.findViewById(R.id.citaTextView);
        autorTextView = (TextView)this.findViewById(R.id.autorTextView);
        nuevaCitaButton = (Button)this.findViewById(R.id.nuevaCitaButton);

        //dando valores:3
        autores[0] = "Walt Disney";
        citas[0] = "Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir";

        autores[1] = "Albert Einstein";
        citas[1] = "La imaginación es más importante que el conocimiento";

        autores[2] = "Steve Jobs";
        citas[2] = "Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona";

        autores[3] = "Albert Camus";
        citas[3] = "El éxito es fácil de obtener. Lo difícil es merecerlo.";

        autores[4] = "Irving Berlin";
        citas[4] = "El sabio no dice lo que sabe, y el necio no sabe lo que dice.";

    }

    public void clickNuevaCita(View view){
        int numeroRandom = generarNuevosAleatorios(citas.length);
        String cita = citas[numeroRandom];
        String autor = autores[numeroRandom];
        citaTextView.setText(cita);
        autorTextView.setText(autor);
    }

    private int generarNuevosAleatorios(int max){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        return random.nextInt(max);
    }
}
