package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;
import java.util.UUID;

@JsonPropertyOrder({"animeid","name","type", "imageurl"})
public interface ProjectionAnime3 {

    UUID getAnimeid();
    String getName();
    String getType();
    String getImageurl();

    @JsonIgnoreProperties("animes")
    Set<ProjectionAuthor2> getAuthors();
}