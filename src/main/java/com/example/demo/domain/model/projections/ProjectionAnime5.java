package com.example.demo.domain.model.projections;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.UUID;

@JsonPropertyOrder({"animeid","name", "imageurl"})

public interface ProjectionAnime5 {
    UUID getAnimeid();
    String getName();
    String getImageurl();
}
