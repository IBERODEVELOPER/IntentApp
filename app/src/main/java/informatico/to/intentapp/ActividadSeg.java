package informatico.to.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.text.style.EasyEditSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class ActividadSeg extends AppCompatActivity {
    //creamos las variable
    private TextView tvMsg;
    private Button btnaceptar,btnrechazar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_seg);
        //instancia de las variables con los controles
        btnaceptar=(Button)findViewById(R.id.btnaceptar);
        btnrechazar=(Button)findViewById(R.id.btnrechazar);
        tvMsg = (TextView) findViewById(R.id.tvnombre);
        //recibe la informacion lanzada
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("nombreJugador");
        s =  s + " Bienvenido a la Blog El Informatico Ibero.¿Aceptas el uso de tus Datos?";
        tvMsg.setText(s);

        btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = makeText(ActividadSeg.this,"Usted acepto", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnrechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = makeText(ActividadSeg.this,"Usted Rechazo", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });

    }
}