package informatico.to.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Acercade extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        Button btnsalirde=(Button)findViewById(R.id.btnsalirde);
        TextView textView=(TextView)findViewById(R.id.tvacercade);
        //recibe la informacion lanzada
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("nombreJugador");
        s =  s + " El blog Informatico es creado en el 2015 con el objetivo de " +
                "aportar al mundo de la tecnologia y" +
                " crecer juntos con sus visitantes en conocimiento." +
                "En la actualidad viene siendo actulizado el contenido del blog";
        textView.setText(s);

        btnsalirde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}