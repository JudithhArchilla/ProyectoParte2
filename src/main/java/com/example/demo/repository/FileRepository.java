package com.example.demo.repository;

import com.example.demo.domain.model.File;
import com.example.demo.domain.model.projections.ProjectionFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.domain.dto.FileResult;

import java.util.List;
import java.util.UUID;

public interface FileRepository extends JpaRepository<File, UUID> {

    @Query("select fileid from File")
    List<String> getFileid();

   // List<FileResult> findBy();
    List<ProjectionFile> findBy();
}
