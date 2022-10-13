package com.example.peliculas.bean;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
        String title;
    @SerializedName("year")
        Number year;
    @SerializedName("runtime")
        Number runtime;
    @SerializedName("generes")
        String generes;
    @SerializedName("director")
        String director;
    @SerializedName("actors")
        String actors;
    @SerializedName("plot")
        String plot;
    @SerializedName("posterUrl")
        String posterUrl;
}
