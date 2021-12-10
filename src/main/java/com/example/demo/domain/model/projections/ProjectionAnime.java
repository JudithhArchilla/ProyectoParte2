package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;
import java.util.UUID;

@JsonPropertyOrder({"animeid","name", "description", "type", "year", "imageurl"})
public interface ProjectionAnime {
    UUID getAnimeid();
    String getName();
    String getDescription();
    String getType();
    String getYear();
    String getImageurl();


    @JsonIgnoreProperties("animes")
    Set<ProjectionAuthor> getAuthors();
    @JsonIgnoreProperties("animes")
    Set<ProjectionGenres> getGenres();
}