package ar.com.develup.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View viewFucsia;
    private View.OnClickListener miClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("LOG", "View Fucsia clickeado!");
            viewFucsia.setBackgroundColor(Color.BLUE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewFucsia = findViewById(R.id.fucsia);

        this.viewFucsia.setOnClickListener(miClickListener);
    }


}
