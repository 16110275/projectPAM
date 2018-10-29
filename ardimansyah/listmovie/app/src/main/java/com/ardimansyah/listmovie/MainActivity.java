package com.ardimansyah.listmovie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.drawable.movie_after_earth, "After Earth" , "2013"));
        moviesList.add(new Movie(R.drawable.movie_baby_driver, "Baby Driver" , "2017"));
        moviesList.add(new Movie(R.drawable.movie_deadpool, "Deadpool" , "2016"));
        moviesList.add(new Movie(R.drawable.movie_divergent, "Divergent" , "2014"));
        moviesList.add(new Movie(R.drawable.movie_fight, "Fight Club" , "1999"));
        moviesList.add(new Movie(R.drawable.movie_jaws, "Jaws" , "1975"));
        moviesList.add(new Movie(R.drawable.movie_pirates, "Pirates of the Caribbean" , "2011"));
        moviesList.add(new Movie(R.drawable.movie_star, "Star Wars" , "2016"));
        moviesList.add(new Movie(R.drawable.movie_the_grey, "The Grey" , "2011"));

        MovieAdapter mAdapter = new MovieAdapter(this, moviesList);
        listView.setAdapter(mAdapter);

    }
}
