package com.example.peliculas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.peliculas.R;
import com.example.peliculas.bean.Pelicula;

import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.ViewHolder>{
    private List<Pelicula> mPelicula;
    private Context context;

    public PeliculasAdapter(List<Pelicula> mPelicula){
        this.mPelicula = mPelicula;
    }

    public void reloadData(List<Pelicula> peliculas){
        this.mPelicula = peliculas;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(this.context);

        View contactView = inflater.inflate(R.layout.item_pelicula, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pelicula pelicula = mPelicula.get(position);
        holder.title.setText(pelicula.title);
        holder.year.setText(pelicula.year);
        holder.runtime.setText(pelicula.runtime);
        holder.director.setText(pelicula.director);
        holder.actores.setText(pelicula.actors);
        holder.plot.setText(pelicula.plot);
        Glide.with(this.context).load(pelicula.posterUrl).into(holder.posterUrl);




    }

    @Override
    public int getItemCount() {
        return mPelicula.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView posterUrl;
        private TextView title, year, runtime, director, actores, plot;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterUrl = itemView.findViewById(R.id.peli_image);
            title = itemView.findViewById(R.id.peli_title);
            year = itemView.findViewById(R.id.peli_year);
            runtime = itemView.findViewById(R.id.peli_runtime);
            director = itemView.findViewById(R.id.peli_director);
            actores = itemView.findViewById(R.id.peli_actors);
            plot = itemView.findViewById(R.id.peli_plot);
        }
    }
}
