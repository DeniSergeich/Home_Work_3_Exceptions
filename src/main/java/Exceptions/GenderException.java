package Exceptions;

public class GenderException extends PersonException{

    private final String gender;

    public GenderException(String message, String gender) {
        super(message);
        this.gender = gender;
    }

    @Override
    public String getContext() {
        return gender;
    }
}