package com.gl.java.exceptions;

public class CustomizeCheckedException extends Exception  {

        public CustomizeCheckedException(String message) {
            super(message);
        }

        public CustomizeCheckedException(String message, Throwable cause) {
            super(message, cause);
        }
}
