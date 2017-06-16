package ariel.sv.com.colorquotes;

import android.os.PersistableBundle;
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
    private static final String CITA ="cita" ;
    private static final String AUTOR = "autor";
    private static final String COLOR = "color";
    //Nuestros elementos
    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaCitaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables ligados a nuestra UI:3
        citaTextView = (TextView)this.findViewById(R.id.citaTextView);
        autorTextView = (TextView)this.findViewById(R.id.autorTextView);
        nuevaCitaButton = (Button)this.findViewById(R.id.nuevaCitaButton);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(CITA,citaTextView.getText().toString());
        outState.putString(AUTOR,autorTextView.getText().toString());
        outState.putInt(COLOR, citaTextView.getCurrentTextColor());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"restoreInstaceSate");
        ///para recuperar nuestros datos guardados cuandoo cambie la orientación
        int color = savedInstanceState.getInt(COLOR);
        citaTextView.setTextColor(color);
        autorTextView.setTextColor(color);
        nuevaCitaButton.setBackgroundColor(color);
        citaTextView.setText(savedInstanceState.getString(CITA));
        autorTextView.setText(savedInstanceState.getString(AUTOR));

    }

    public void clickNuevaCita(View view){
        GeneradorCitas generadorCitas = new GeneradorCitas();
        Cita cita  = generadorCitas.obtenerCitaAleatoria();
        citaTextView.setText(cita.getText());
        autorTextView.setText(cita.getAutor());
        citaTextView.setTextColor(cita.getColor());
        autorTextView.setTextColor(cita.getColor());
        nuevaCitaButton.setBackgroundColor(cita.getColor());
    }


}
