package com.test.ingerencia.model.response;


import lombok.Data;

@Data
public class Status {
    
    private String code;
    private String message;

    public Status(String code, String message)
    {
        this.code = code;
        this.message = message;
    }
}
