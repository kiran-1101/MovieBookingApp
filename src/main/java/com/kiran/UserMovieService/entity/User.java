package com.kiran.UserMovieService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "user_id",nullable = false,length = 100)
    private int userId;
    @Column(name= "name",nullable = false, length = 15)
    private String userName;
    @Column(name= "age")
    private  String age;
    @Column(name= "mailid")
    @Email
    private String mailId;
    @Column(name= "moviename")
    private  String movieName;
    @Column(name= "status")
    private String status;
    @Column(name = "movietime")
    private int movietime;
}
