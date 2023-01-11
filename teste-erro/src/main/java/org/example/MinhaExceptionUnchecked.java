package org.example;

public class MinhaExceptionUnchecked extends RuntimeException {

    public MinhaExceptionUnchecked() {

    }

    public MinhaExceptionUnchecked(String msg) {
        super(msg);
    }
}
