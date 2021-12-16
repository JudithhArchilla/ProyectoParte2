package com.example.demo.domain.dto;

import java.util.UUID;

public class FileToShow {
    public UUID fileid;
    public String contenttype;

    public FileToShow(UUID fileid, String contenttype) {
        this.fileid = fileid;
        this.contenttype = contenttype;
    }
}