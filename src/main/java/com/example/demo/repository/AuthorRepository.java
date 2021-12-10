package com.example.demo.repository;

import com.example.demo.domain.model.Author;
import com.example.demo.domain.model.projections.ProjectionAnime;
import com.example.demo.domain.model.projections.ProjectionAuthor;
import com.example.demo.domain.model.projections.ProjectionGenres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {

    //List<ProjectionAuthor> findBy();

    <T> List <T> findBy (Class<T> type);


}