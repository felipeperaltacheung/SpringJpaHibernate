package com.educandoweb.springjpahibernate.services.exceptions;

public class ResourcesNotFoundException extends RuntimeException{

    public ResourcesNotFoundException(Object id){
        super("Resource not found. Id" + id);
    }

}
