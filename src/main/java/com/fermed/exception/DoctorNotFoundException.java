package com.fermed.exception;

public class DoctorNotFoundException extends Exception {
    public DoctorNotFoundException() {
        super("Doctor with this username is already there in DB !! try again");
    }
    public DoctorNotFoundException(String msg) {
        super(msg);
    }
}
