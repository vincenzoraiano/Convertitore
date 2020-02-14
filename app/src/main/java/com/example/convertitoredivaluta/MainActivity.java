package com.example.convertitoredivaluta;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//Metodo Onclick per usare il bottone di conversione.
  public  void convertiButton(View view){

      //log per controllare il funzionamento del bottone
      Log.i("Stato Botone","Premuto");

      //creo una variabile che associo il numero inserito nella barra di text viev
      //cercando l'input tramite id.
      EditText valuta=(EditText) findViewById(R.id.numeroConvertire);

      //con questo log riesco a controllare il valore inserito dall'utente
      Log.i("Il valore inserito",valuta.getText().toString());

      //Assrgno il valore della variabile valuta alla stringa ammountEuroString.
      String ammoutEuroStringa=valuta.getText().toString();

      //converto la stringa in un Double con il metodo parseDouble
      double ammoutnEuroDouble=Double.parseDouble(ammoutEuroStringa);

      //effettuo le varie conversioi utilizzando il valore convertito in double
      double ammoutDollari=ammoutnEuroDouble*1.3;

      double ammountYen=ammoutnEuroDouble*3.4;

      double ammountYuhan=ammoutnEuroDouble*10.4;

      //il Toast mi consente di restituire il valore convertito.
      Toast.makeText(this,"il valore da"+" Euro a dollari é="+ammoutDollari,Toast.LENGTH_SHORT).show();

      Toast.makeText(this,"il valore da"+" Euro a Yen é="+ammountYen,Toast.LENGTH_SHORT).show();

      Toast.makeText(this,"il valore da"+" Euro a Yuhan é="+ammountYuhan,Toast.LENGTH_SHORT).show();

  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
