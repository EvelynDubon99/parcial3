package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.peliculas.Adapter.BooksAdapter;
import com.example.peliculas.Adapter.PeliculasAdapter;
import com.example.peliculas.bean.Book;
import com.example.peliculas.bean.Pelicula;
import com.example.peliculas.presenter.BookPresenter;
import com.example.peliculas.presenter.IBookPresenter;
import com.example.peliculas.presenter.IPeliculasPresenter;
import com.example.peliculas.presenter.PeliculasPresenter;
import com.example.peliculas.view.IBookView;
import com.example.peliculas.view.IPeliculaView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IPeliculaView {

    private IPeliculasPresenter peliculasPresenter;
    private PeliculasAdapter adapter;
    private IBookPresenter bookPresenter;
    private BooksAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.peliculasPresenter = new PeliculasPresenter(this);
        this.peliculasPresenter.getPeliculas();

        RecyclerView rvPeliculas = (RecyclerView) findViewById(R.id.pelicula_list);
        this.adapter = new PeliculasAdapter(new ArrayList<>());
        rvPeliculas.setAdapter(adapter);
        rvPeliculas.setLayoutManager(new LinearLayoutManager(this));

        //this.bookPresenter = new BookPresenter(this);
        //this.bookPresenter.getBooks();

        //RecyclerView rvBooks = (RecyclerView) findViewById(R.id.books_list);
        //this.adapter2 = new BooksAdapter(new ArrayList<>());
        //rvBooks.setAdapter(adapter2);
        //rvBooks.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onPeliculasSuccess(List<Pelicula> pelicula) {
        adapter.reloadData(pelicula);

    }

    @Override
    public void onPeliculasError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }

   // @Override
    //public void onBookSuccess(List<Book> books) {
       // adapter2.reloadData(books);
    //}

    //@Override
    //public void onBookError(String msg) {
       // Toast.makeText(this, msg, Toast.LENGTH_LONG)
         //       .show();
    //}
}