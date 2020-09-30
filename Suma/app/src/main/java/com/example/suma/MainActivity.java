package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Resultado = (TextView)findViewById(R.id.Textto2);
        final Button miBoton = (Button)findViewById(R.id.miBoton);
        final EditText NumeroUno = (EditText)findViewById(R.id.NumeroUno);
        final EditText NumeroDos = (EditText)findViewById(R.id.NumeroDos);



        miBoton.setOnClickListener( new View.OnClickListener (){
            @Override
            public void onClick(View v) {

                String NumUno = NumeroUno.getText().toString();
                String NumDos = NumeroUno.getText().toString();




                int NumEnteroUno = Integer.parseInt(NumUno);
                int NumEnteroDos = Integer.parseInt(NumDos);
                int Total = NumEnteroUno+NumEnteroDos;

                String TotalCadena = String.valueOf(Total);

                Resultado.setText(TotalCadena);


            }


        });





    }
        }














