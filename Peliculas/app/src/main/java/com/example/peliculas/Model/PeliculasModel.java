package com.example.peliculas.Model;

import com.example.peliculas.API.ApiCliant;
import com.example.peliculas.API.PeliculasApi;
import com.example.peliculas.bean.Movies;
import com.example.peliculas.bean.Pelicula;
import com.example.peliculas.presenter.IPeliculasPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeliculasModel implements PeliculaModel{
    private IPeliculasPresenter presenter;
    private PeliculasApi api;

    public PeliculasModel(IPeliculasPresenter presenter){
        this.presenter = presenter;
        api = ApiCliant.getInstance().create(PeliculasApi.class);
    }

    @Override
    public void getPeliculas() {
        Call<Movies> bookCall = api.getPeliculas();
        bookCall.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {
                presenter.onPeliculasSuccess(response.body().movies);
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {
                presenter.onPeliculasError("Error al obtener peliculas");
            }
        });

    }
}
