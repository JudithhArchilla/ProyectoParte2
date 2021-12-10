package com.example.demo.domain.model.projections;

import java.util.UUID;

public interface ProjectionFile {

    UUID getFileid();
    String getContenttype();
}