package ar.com.develup.myapplication.actividades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ar.com.develup.myapplication.R;
import ar.com.develup.myapplication.adaptadores.AdaptadorDeArticulos;
import ar.com.develup.myapplication.modelo.Articulo;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by facundomr on 6/3/17.
 */

public class ListadoActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    private AdaptadorDeArticulos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo_framelayout);
        ButterKnife.bind(this);

        configurarRecyclerView();
    }

    private void configurarRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Articulo> articulos = obtenerArticulos();

        adaptador = new AdaptadorDeArticulos(articulos);
        recyclerView.setAdapter(adaptador);
    }

    private List<Articulo> obtenerArticulos() {

        List<Articulo> articulos = new ArrayList<Articulo>();

        for (int i = 0; i < 100; i++) {

            Articulo articulo = new Articulo();
            articulo.setTitulo("Articulo " + i);
            articulo.setPrecio("$ " + i * 100);

            articulos.add(articulo);
        }

        return articulos;
    }


}