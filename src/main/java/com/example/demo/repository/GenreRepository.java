package com.example.demo.repository;

import com.example.demo.domain.model.Anime;
import com.example.demo.domain.model.Genre;
import com.example.demo.domain.model.projections.ProjectionGenres;
import com.example.demo.domain.model.projections.ProjectionGenres2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GenreRepository extends JpaRepository<Genre, UUID> {

    void deleteById(UUID id);

    //List<ProjectionAnime> findBy();

    <T> List <T> findBy (Class<T> type);
    ProjectionGenres2 findByGenreid (UUID id);

}
