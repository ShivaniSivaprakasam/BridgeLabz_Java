package coreprogramming.stringfunction.level1;

/*
 * This program demonstrates handling of NullPointerException
 * when trying to access the length of a null string.
 */
public class NullPointerException {

    /*
     * This method intentionally causes a NullPointerException
     * by accessing the length of a null string
     */
    public static void nullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw exception
    }

    /*
     * This method handles NullPointerException
     * and prints an appropriate message
     */
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length()); // May throw exception
        } catch (java.lang.NullPointerException e) {
            // Handling null pointer exception
            System.out.println("NullPointerException handled: text is null");
        }
    }

    public static void main(String[] args) {

        // Calling the method that handles NullPointerException
        // nullPointerException(); // Uncomment to see the exception occur
        handleNullPointerException();
    }
}

