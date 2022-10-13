package com.example.peliculas.presenter;

import com.example.peliculas.Model.PeliculaModel;
import com.example.peliculas.Model.PeliculasModel;
import com.example.peliculas.bean.Pelicula;
import com.example.peliculas.view.IPeliculaView;

import java.util.List;

public class PeliculasPresenter implements IPeliculasPresenter{

    private IPeliculaView view;
    private PeliculasModel model;


    public PeliculasPresenter(IPeliculaView view){
        this.view = view;
        this.model = new PeliculasModel(this);
    }


    @Override
    public void getPeliculas() {
        this.model.getPeliculas();
    }

    @Override
    public void onPeliculasSuccess(List<Pelicula> pelicula) {
        if(view == null)
            return;

        this.view.onPeliculasSuccess(pelicula);
    }

    @Override
    public void onPeliculasError(String msg) {
        if(view == null)
            return;

        this.view.onPeliculasError(msg);
    }
}
