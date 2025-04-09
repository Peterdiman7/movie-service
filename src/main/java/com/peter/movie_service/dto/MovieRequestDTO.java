package com.peter.movie_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieRequestDTO {

    @NotBlank(message = "Title is required!")
    private String title;

    @NotBlank(message = "Director is required!")
    private String director;

    @NotBlank(message = "Release Date is required!")
    private LocalDate releaseDate;

    @NotBlank(message = "Genre is required!")
    private String genre;

}
