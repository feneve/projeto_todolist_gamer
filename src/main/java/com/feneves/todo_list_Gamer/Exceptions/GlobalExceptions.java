package com.feneves.todo_list_Gamer.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

    @ControllerAdvice
    public class GlobalExceptions {

        @ExceptionHandler(ResponseStatusException.class)
        public ResponseEntity<String> handleResponseStatusException(ResponseStatusException ex) {
            return new ResponseEntity<>(ex.getReason(), ex.getStatusCode());
        }
    }

