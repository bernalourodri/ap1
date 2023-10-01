package com.ap1.crudap1.errorHandler;

public class Validation {
    private String field;
    private String message;

    public Validation(String field, String message){
        super();
        this.field = field;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
}
