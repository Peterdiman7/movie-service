package com.peter.movie_service.service;

import com.peter.movie_service.dto.MovieRequestDTO;
import com.peter.movie_service.dto.MovieResponseDTO;

import java.util.List;

public interface MovieService {
    List<MovieResponseDTO> getMovies();
    MovieResponseDTO saveMovie(MovieRequestDTO movieRequestDTO);
}
