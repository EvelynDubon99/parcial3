package com.example.peliculas.Model;


import com.example.peliculas.API.ApiCliant;
import com.example.peliculas.API.BooksApi;
import com.example.peliculas.bean.Book;
import com.example.peliculas.presenter.IBookPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookModel implements IBookModel {

    private IBookPresenter presenter;
    private BooksApi api;

    public BookModel(IBookPresenter presenter) {
        this.presenter = presenter;
        api = ApiCliant.getInstance2().create(BooksApi.class);
    }

    @Override
    public void getBooks() {
        Call<List<Book>> bookCall = api.getBooks();
        bookCall.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                presenter.onBooksSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {
                presenter.onBooksError("Error el obtener los libros");
            }
        });
    }
}
