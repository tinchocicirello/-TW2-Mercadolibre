package ar.com.develup.myapplication.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by facundomr on 5/6/17.
 */

public class Articulo {

    @SerializedName("title")
    private String titulo;

    @SerializedName("price")
    private String precio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}