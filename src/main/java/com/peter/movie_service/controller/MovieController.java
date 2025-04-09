package com.peter.movie_service.controller;

import com.peter.movie_service.dto.MovieRequestDTO;
import com.peter.movie_service.dto.MovieResponseDTO;
import com.peter.movie_service.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<MovieResponseDTO>> getMovies() {
        List<MovieResponseDTO> movieResponseDTOS = movieService.getMovies();

        return ResponseEntity.ok(movieResponseDTOS);
    }

    @PostMapping
    public ResponseEntity<MovieResponseDTO> saveMovie(@RequestBody MovieRequestDTO movieRequestDTO) {
        MovieResponseDTO movieResponseDTO = movieService.saveMovie(movieRequestDTO);

        return ResponseEntity.ok(movieResponseDTO);
    }
}
