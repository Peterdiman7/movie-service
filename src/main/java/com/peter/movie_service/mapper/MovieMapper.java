package com.peter.movie_service.mapper;

import com.peter.movie_service.dto.MovieRequestDTO;
import com.peter.movie_service.dto.MovieResponseDTO;
import com.peter.movie_service.model.Movie;

public class MovieMapper {
    public static MovieResponseDTO toDTO(Movie movie) {
        MovieResponseDTO movieResponseDTO = new MovieResponseDTO();

        movieResponseDTO.setId(movie.getId());
        movieResponseDTO.setTitle(movie.getTitle());
        movieResponseDTO.setDirector(movie.getTitle());
        movieResponseDTO.setReleaseYear(movie.getReleaseYear());
        movieResponseDTO.setGenre(movie.getGenre());

        return movieResponseDTO;
    }

    public static Movie toModel(MovieRequestDTO movieRequestDTO) {
        Movie movie = new Movie();

        movie.setTitle(movieRequestDTO.getTitle());
        movie.setDirector(movieRequestDTO.getDirector());
        movie.setReleaseYear(movieRequestDTO.getReleaseYear());
        movie.setGenre(movieRequestDTO.getGenre());

        return movie;
    }
}
