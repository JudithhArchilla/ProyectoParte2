package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProjectionUserDetail {

    UUID getUserid();
    String getUsername();

    @JsonIgnoreProperties("favoritedby")
    Set<ProjectionAnime> getFavorites();


}