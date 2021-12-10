package com.example.demo.controller;

import com.example.demo.domain.dto.ErrorMessage;
import com.example.demo.domain.dto.ListResult;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.model.Genre;
import com.example.demo.domain.model.projections.ProjectionGenres;
import com.example.demo.domain.model.projections.ProjectionGenres2;
import com.example.demo.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllGenre(Authentication authentication) {
        return ResponseEntity.ok().body(ListResult.list(genreRepository.findBy(ProjectionGenres.class)));

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findAllGenreById (@PathVariable UUID id){
        ProjectionGenres2 genre = genreRepository.findByGenreid(id);
        if (genre!= null){
            return ResponseEntity.ok().body(genre);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("No s'ha trobat el genre amd id '"+ id + "'"));
        }
    }
}
