package com.example.peliculas.view;



import com.example.peliculas.bean.Book;

import java.util.List;

public interface IBookView {

    void onBookSuccess(List<Book> books);
    void onBookError(String msg);
}
