package com.allml.D137;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("sss",1.1,"ffdf"));
        movies.add(new Movie("sfss",1.2,"sdseffdf"));
        movies.add(new Movie("sssdfs",1.23,"ffdfhsf"));

        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
    }
}
