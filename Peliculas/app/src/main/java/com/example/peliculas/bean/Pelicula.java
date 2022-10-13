package com.example.peliculas.bean;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
    public String title;
    @SerializedName("year")
    public  String year;
    @SerializedName("runtime")
    public String runtime;
    @SerializedName("generes")
    public String[] generes;
    @SerializedName("director")
    public String director;
    @SerializedName("actors")
    public String actors;
    @SerializedName("plot")
    public String plot;
    @SerializedName("posterUrl")
    public String posterUrl;

}
