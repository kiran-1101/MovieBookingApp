package com.kiran.UserMovieService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "user_id")
    private int userId;
    @Column(name= "name")
    private String userName;
    @Column(name= "age")
    private  String age;
    @Column(name= "mailid")
    private String mailId;
    @Column(name= "moviename")
    private  String movieName;
    @Column(name= "status")
    private String status;
    @Column(name = "movietimme")
    private String movietime;
}
