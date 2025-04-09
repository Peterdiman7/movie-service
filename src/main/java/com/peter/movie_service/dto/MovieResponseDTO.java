package com.peter.movie_service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieResponseDTO {
    private Long id;

    private String title;

    private String director;

    private LocalDate releaseDate;

    private String genre;

}
