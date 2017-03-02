package segundotina.fiap.com.br.myapplication;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

//    AutoCompleteTextView actvPaises;
//    String[] paises = new String[]{"Argentina", "Brasil", "Chile", "Dinamarca", "Escócia"};
//    DatePicker dtAniversario;
    //TimePicker tmpHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        actvPaises = (AutoCompleteTextView) findViewById(R.id.actvPaises);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, paises);
//        actvPaises.setAdapter(adapter);
//
//        dtAniversario = (DatePicker) findViewById(R.id.dpAniversario);

        //tmpHorario = (TimePicker) findViewById(R.id.tmpHorario);
    }

    public void salvar(View v){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this, i2 + "/" + (i1 + 1) + "/" + i, Toast.LENGTH_SHORT).show();
            }
        }, 2017, 03,02);
        datePickerDialog.show();
    }

//    public void salvar(View v){
//        ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setTitle(getString(R.string.carregando));
//        progressDialog.setMessage(getString(R.string.aguarde));
//        progressDialog.show();
//    }


    //DIALOG
//    public void salvar(View v){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle(R.string.titulo);
//        builder.setMessage(R.string.msg);
//        builder.setIcon(android.R.drawable.ic_dialog_alert);
//        builder.setCancelable(false);
//        //builder.setNeutralButton("Fechar", null);
//        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, R.string.clicou_ok, Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.setNegativeButton(R.string.fechar, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, R.string.clicou_fechar, Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.show();
//    }

    //CALENDARIO
//    public void salvar(View v){
//        int year = dtAniversario.getYear();
//        int month = dtAniversario.getMonth() + 1;
//        int day = dtAniversario.getDayOfMonth();
//
//        Calendar calendar = new GregorianCalendar(year, month, day);
//
//        //fazer cada parte separadamente
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle(getString(R.string.data_escolhida));
//        dialog.setMessage(day + "/" + month + "/" + year);
//        dialog.show();
//    }

    //HORARIO
//    public void salvar(View v){
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
//            int hour = tmpHorario.getHour();
//            int minute = tmpHorario.getMinute();
//        }
//        //funciona em todas as versoes, mas quasem desuso
////        int hour = tmpHorario.getCurrentHour();
////        int minute = tmpHorario.getCurrentMinute();
//    }
}
