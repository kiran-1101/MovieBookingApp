package com.kiran.UserMovieService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie")
public class Movie {
    @Column (name = "movieid")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieid;
    @Column(name = "moviename")
    private String moviename;
    @Column(name = "movietime")
    private String movietime;
}
