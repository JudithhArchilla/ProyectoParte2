package com.example.demo.repository;

import com.example.demo.domain.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {

    Anime findByName(String name);
    

    void deleteById(UUID id);

    //List<ProjectionAnime> findBy();

    <T> List <T> findBy (Class<T> type);

    Anime findByAnimeid(UUID animeid);
}
