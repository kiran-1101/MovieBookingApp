package com.kiran.UserMovieService.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {

    String messasge;
    Boolean status;

    public ApiResponse(String messasge, Boolean status){
        this.messasge = messasge;
        this.status = status;
    }
}
