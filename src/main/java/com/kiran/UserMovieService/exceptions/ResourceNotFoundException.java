package com.kiran.UserMovieService.exceptions;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String fieldName;
    long fieldId;
    String fieldname;
    public ResourceNotFoundException(String resourceName, String fieldName,long fieldId){
        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldId));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldId = fieldId;
    }
    public ResourceNotFoundException(String resourceName, String fieldName,String fieldname){
        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldname));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldname = fieldname;
    }
}

