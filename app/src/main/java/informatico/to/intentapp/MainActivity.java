package informatico.to.intentapp;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Variables
    Button btningresar,btnacercade,btnsalir;
    EditText etNombre;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Habilitamos el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //le damos la ruta para que muestre la imagen del action bar
        getSupportActionBar().setIcon(R.drawable.ic_action_name);

        //Instanciamos las variables
        etNombre=(EditText)findViewById(R.id.EdTextName);
        btningresar=(Button)findViewById(R.id.btningresar);
        btnacercade=(Button)findViewById(R.id.btnacercade);
        btnsalir=(Button)findViewById(R.id.btnsalir);

        //metodo del boton ingresar
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //llama al metodo
                LanzarDatos(null);
                 }});
        //metodo del boton acerca de
        btnacercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //llamamos al metodo
                lanzarActividad(null);
            }
        });
        //metodo del boton salir
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0); }     });
    }
    //Lanzarlos datos de la actividad main
    public void LanzarDatos(View v){
        Intent i = new Intent(this,ActividadSeg.class);
        i.putExtra("nombreJugador",etNombre.getText().toString());
        startActivityForResult(i, 1234); }
    //Lanzarlos datos de la actividad acerca de
    public void lanzarActividad(View view){
        Intent i = new Intent(this,Acercade.class);
        i.putExtra("nombreJugador",etNombre.getText().toString());
        startActivityForResult(i, 1234);
        startActivity(i);    }
}