package ar.com.develup.myapplication.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ar.com.develup.myapplication.R;
import ar.com.develup.myapplication.modelo.Articulo;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by facundomr on 6/3/17.
 */

public class AdaptadorDeArticulos extends RecyclerView.Adapter<AdaptadorDeArticulos.ViewHolder> {

    private List<Articulo> articulos = new ArrayList<Articulo>();

    public AdaptadorDeArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public int getItemCount() {
        return articulos.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_articulo, null);

        return new AdaptadorDeArticulos.ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Articulo articulo = this.articulos.get(position);

        holder.titulo.setText(articulo.getTitulo());
        holder.precio.setText(articulo.getPrecio());

        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Listado" , "Click en item " + position);
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final View item;

        @BindView(R.id.titulo) TextView titulo;

        @BindView(R.id.precio) TextView precio;

        public ViewHolder(View itemView) {
            super(itemView);
            this.item = itemView;
            ButterKnife.bind(this, itemView);
        }
    }

}