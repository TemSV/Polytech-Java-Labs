package exceptions;

public class FileReadException extends Exception {
    public FileReadException() {
        super("Error! Unable to read file!");
    }

    public FileReadException(String message) {
        super(message);
    }
}
