package com.example.demo.controller;

import com.example.demo.domain.dto.ErrorMessage;
import com.example.demo.domain.dto.ListResult;
import com.example.demo.domain.model.Anime;
import com.example.demo.domain.model.Author;
import com.example.demo.domain.model.projections.ProjectionAnime;
import com.example.demo.domain.model.projections.ProjectionAuthor;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllAuthor(Authentication authentication) {
        return ResponseEntity.ok().body(ListResult.list(authorRepository.findBy(ProjectionAuthor.class)));

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findAllAuthorById (@PathVariable UUID id){
        Author author = authorRepository.findById(id).orElse(null);
        if (author!= null){
            return ResponseEntity.ok().body(author);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorMessage.message("No s'ha trobat l'author amd id '"+ id + "'"));
        }
    }
}
