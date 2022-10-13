package com.example.peliculas.API;


import com.example.peliculas.bean.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BooksApi {

    @GET("/books.json")
    Call<List<Book>> getBooks();

}

