package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Data
@NoArgsConstructor
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String genre;
    @Column
    private int year;
    @Transient
    private MultipartFile pdfFile;
//    public Books(){}
    public Books(String title, String author, String genre, int year, MultipartFile pdfFile) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.pdfFile = pdfFile;
    }
}
