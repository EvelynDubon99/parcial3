package com.example.peliculas.API;

import com.example.peliculas.bean.Pelicula;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PeliculasApi {
    @GET("/db.json")
    Call<List<Pelicula>> getPeliculas();


}
