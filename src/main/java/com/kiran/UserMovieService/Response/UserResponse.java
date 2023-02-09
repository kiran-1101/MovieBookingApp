package com.kiran.UserMovieService.Response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserResponse {

    private int userId;
    private String userName;
    private  String age;
    private String mailId;
    private  String movieName;
    private String status;
    private int movietime;

}
