package com.ltp.gradesubmission;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Grade {
    private String id;
    private String name;
    private String subject;
    private String score;

    public Grade(){
        this.id= UUID.randomUUID().toString();
    }
}
