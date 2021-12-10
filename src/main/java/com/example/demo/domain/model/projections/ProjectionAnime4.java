package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;
import java.util.UUID;

@JsonPropertyOrder({"animeid","name","type","year", "imageurl"})
public interface ProjectionAnime4 {

    UUID getAnimeid();
    String getName();
    String getType();
    String getYear();
    String getImageurl();

    @JsonIgnoreProperties("animes")
    Set<ProjectionAuthor2> getAuthors();
}