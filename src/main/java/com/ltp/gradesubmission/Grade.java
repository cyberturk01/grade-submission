package com.ltp.gradesubmission;

import java.util.UUID;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Grade {

   
    private String id;

    @NotBlank(message= "Name cannot be blank")
    private String name;
    @NotBlank(message= "Subject cannot be blank")
    private String subject;
    @Max(value= 100, message = "Score can not be more than 100")
    private String score;

    public Grade(){
        this.id= UUID.randomUUID().toString();
    }
}
