package com.fermed.exception;

public class DoctorFoundException extends Exception {
    public DoctorFoundException() {
        super("Doctor with this username not found in DB!!!");
    }
    public DoctorFoundException(String msg) {
        super(msg);
    }
}

