package com.fermed.exception;

import lombok.Data;


public class ResourceNotFoundException  extends RuntimeException{
    //creating unchecked exception
   String resourceName;
   String fieldName;
   long fieldValue;
   String messege;

   public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue)
   {
       super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
       this.resourceName = resourceName;
       this.fieldName = fieldName;
       this.fieldValue = fieldValue;
   }

    public ResourceNotFoundException(String message) {
       super(String.format("Resourse is not found %s", message));
    }
}
