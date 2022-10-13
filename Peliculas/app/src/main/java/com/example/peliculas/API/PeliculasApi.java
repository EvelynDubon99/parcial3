package com.example.peliculas.API;

import com.example.peliculas.bean.Movies;
import com.example.peliculas.bean.Pelicula;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PeliculasApi {
    @GET("erik-sytnyk/movies-list/master/db.json")
    Call<Movies> getPeliculas();


}
