package br.com.firstProgramacao.watchOnline.exception;

public class InvalidYearException extends RuntimeException {
    private String messageError;
    public InvalidYearException(String message) {
        this.messageError = message;
    }

    @Override
    public String getMessage() {
        return this.messageError;
    }
}
