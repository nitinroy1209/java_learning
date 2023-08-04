package practice;


public class AgeLessThanZeroException extends Exception {
    // we can pass the argument for our own exception, but for that we have to create a constructor
    public AgeLessThanZeroException() {
        // Constructor logic goes here (if needed)
    }
    
    public AgeLessThanZeroException(String message) {
        super(message); // our constructor is calling the same version of the constructor in Exception
    }
}

