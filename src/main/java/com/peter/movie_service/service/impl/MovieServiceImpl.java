package com.peter.movie_service.service.impl;

import com.peter.movie_service.dto.MovieResponseDTO;
import com.peter.movie_service.mapper.MovieMapper;
import com.peter.movie_service.model.Movie;
import com.peter.movie_service.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl {
    private final MovieRepository movieRepository;

    public List<MovieResponseDTO> getMovies() {
        List<Movie> movies = movieRepository.findAll();

        return movies.stream().map(MovieMapper::toDTO).toList();
    }
}
