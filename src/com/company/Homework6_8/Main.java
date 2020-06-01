package com.company.Homework6_8;

import com.company.Movie;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        com.company.Movie[] moviesArray = new com.company.Movie[10];

        Random random = new Random();

        initializeMovies(moviesArray, random);

        int highestRating = findHighestRating(moviesArray);
        extractBestMovies(highestRating, moviesArray);

    }

    private static void initializeMovies(com.company.Movie[] moviesArray, Random random) {
        for (int i = 0; i < moviesArray.length; i++) {
            com.company.Movie movie = new com.company.Movie();
            movie.setTitle("Title" + i);

            movie.setRating(random.nextInt(10));

            moviesArray[i] = movie;
        }
    }

    private static int findHighestRating(com.company.Movie[] moviesArray) {
        int max = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            if (max < moviesArray[i].getRating()) {
                max = moviesArray[i].getRating();
            }
        }
        return max;
    }

    private static void extractBestMovies(int rating, com.company.Movie[] moviesArray) {
        int counter = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            if (moviesArray[i].getRating() == rating) {
                counter++;
            }
        }
        com.company.Movie[] bestRated = new Movie[counter];
        int j = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            if (moviesArray[i].getRating() == rating) {
                bestRated[j] = moviesArray[i];
                j++;
            }
        }
    }
}
