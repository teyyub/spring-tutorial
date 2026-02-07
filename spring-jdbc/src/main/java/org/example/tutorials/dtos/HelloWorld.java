package org.example.tutorials.dtos;

public class HelloWorld {
    private String message;

    public HelloWorld(){
        System.out.println("init hello world");
    }
    public void setMessage(String message){

        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}