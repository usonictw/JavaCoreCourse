package Module10.homework.Task2;

/**
 * Created by PC on ${DATA}.
 */
public class OwnerException extends Exception {

    private String str;

    public String getStr() {
        return str;
    }

    public OwnerException(String message, String str) {
        super(message);
    }


}
