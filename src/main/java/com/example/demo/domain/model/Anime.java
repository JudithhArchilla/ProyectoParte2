package com.example.demo.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "anime")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID animeid;

    public String name;
    public String description;
    public String type;
    public String year;
    public String imageurl;



    @ManyToMany
    @JoinTable(name = "anime_author", joinColumns = @JoinColumn(name = "animeid"), inverseJoinColumns = @JoinColumn(name = "authorid"))
    @JsonIgnoreProperties("animes")
    public Set<Author> authors;

    @ManyToMany
    @JoinTable(name = "anime_genre", joinColumns = @JoinColumn(name = "animeid"), inverseJoinColumns = @JoinColumn(name = "genreid"))
    @JsonIgnoreProperties("animes")
    public Set<Genre> genres;


}