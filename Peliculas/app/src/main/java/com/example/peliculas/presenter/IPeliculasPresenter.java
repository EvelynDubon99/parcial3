package com.example.peliculas.presenter;

import com.example.peliculas.bean.Pelicula;

import java.util.List;

public interface IPeliculasPresenter {
    void getPeliculas();
    void onPeliculasSuccess(List<Pelicula> pelicula);
    void onPeliculasError(String msg);
}
