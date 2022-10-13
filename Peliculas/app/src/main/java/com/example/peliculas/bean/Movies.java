package com.example.peliculas.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movies {
    @SerializedName("movies")
    public List<Pelicula> movies;
}
