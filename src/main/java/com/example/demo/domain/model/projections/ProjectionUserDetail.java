package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

public interface ProjectionUserDetail {
    @JsonIgnoreProperties("favoritedby")
    Set<ProjectionAnime5> getFavorites();


}