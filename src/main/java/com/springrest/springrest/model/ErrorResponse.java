package com.springrest.springrest.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private final Date timestamp;
    private final int status;
    private final String error;
    private final String message;

    public ErrorResponse(String message, int status, Date timestamp, String error) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }
}
