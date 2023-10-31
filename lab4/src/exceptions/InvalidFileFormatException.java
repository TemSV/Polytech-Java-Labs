package exceptions;

public class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException() {
        super("Error! Invalid file format!");
    }
}
