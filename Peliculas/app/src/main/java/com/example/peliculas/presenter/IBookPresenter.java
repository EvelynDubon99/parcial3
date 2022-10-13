package com.example.peliculas.presenter;



import com.example.peliculas.bean.Book;

import java.util.List;

public interface IBookPresenter {

    void getBooks();
    void onBooksSuccess(List<Book> books);
    void onBooksError(String msg);
}
