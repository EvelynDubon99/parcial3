package com.example.peliculas.view;

import com.example.peliculas.bean.Pelicula;

import java.util.List;

public interface IPeliculaView {
    void onPeliculasSuccess(List<Pelicula> pelicula);
    void onPeliculasError(String msg);
}
