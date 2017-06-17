package ar.com.develup.myapplication.actividades;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import ar.com.develup.myapplication.R;
import butterknife.BindString;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindString(R.string.app_name)
    String nombreAplicacion;

    @BindViews({R.id.fucsia, R.id.amarillo})
    List<View> views;

    @OnClick(R.id.fucsia)
    public void clickBotonFucsia(View viewClickeado) {
        Log.i("LOG", "View Fucsia clickeado!");

        for(View v : this.views) {
            v.setBackgroundColor(Color.BLUE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        SharedPreferences.Editor editor = getSharedPreferences("Login", MODE_PRIVATE).edit();
        editor.putString("metodo", "facebook");
        editor.putString("nombreUsuario", "facundo" );
        editor.commit();

        String metodo = getSharedPreferences("Login", MODE_PRIVATE).getString("metodo", null);









    }


}
