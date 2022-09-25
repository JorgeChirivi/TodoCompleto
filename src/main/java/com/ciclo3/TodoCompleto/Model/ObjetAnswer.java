package com.ciclo3.TodoCompleto.Model;

public class ObjetAnswer {
    private Object object;
    private String message;

    //contructor

    public ObjetAnswer(Object object, String message) {
        this.object = object;
        this.message = message;
    }
    //contructor Enpty
    public ObjetAnswer(){

    }
    getter and setter

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public getter getAnd() {
        return and;
    }

    public void setAnd(getter and) {
        this.and = and;
    }
}
