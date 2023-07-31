package com.neosoft.user.app.poc.exception;

public class UserAppException extends Exception{

    public UserAppException(String message) {

        super(message);

    }

    public static String NotFoundException(String id){

        return "User with" +id+ "not found!";
    }

    public static String UserAlreadyExist(){

        return "User with the given name already exist!";
    }
}
