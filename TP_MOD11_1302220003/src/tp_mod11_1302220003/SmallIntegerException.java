package tp_mod11_1302220003;

public class SmallIntegerException extends Exception{
    private static int callCount = 0;

    public SmallIntegerException(String message) {
        super(message);
        callCount++;
    }

    public static int getCallCount() {
        return callCount;
    }    
}
