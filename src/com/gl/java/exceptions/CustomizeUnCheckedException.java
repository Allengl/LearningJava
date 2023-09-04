package com.gl.java.exceptions;

public class CustomizeUnCheckedException extends RuntimeException{

        public CustomizeUnCheckedException(String message) {
            super(message);
        }

        public CustomizeUnCheckedException(String message, Throwable cause) {
            super(message, cause);
        }

}
