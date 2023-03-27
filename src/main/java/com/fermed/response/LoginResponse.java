package com.fermed.response;

import lombok.Data;

@Data
public class LoginResponse {
    //this is class is needed, when we try to login, so we will get a message and status, to see if we have successfully logged in or not
    String message;
    boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public LoginResponse(String message, boolean status) {
        this.message = message;
        this.status = status;

    }
}
