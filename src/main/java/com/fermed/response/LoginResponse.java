package com.fermed.response;

import lombok.Data;

@Data
public class LoginResponse {
    //this is class is needed, when we try to login, so we will get a message and status, to see if we have successfully logded in or not
    String message;
    boolean status;
}
