package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;
import java.util.UUID;

@JsonPropertyOrder({"authorid","name", "imageurl"})
public interface ProjectionAuthor {
    UUID getAuthorid();
    String getName();
    String getImageurl();

    @JsonIgnoreProperties("authors")
    Set<ProjectionAnime2> getAnimes();
}