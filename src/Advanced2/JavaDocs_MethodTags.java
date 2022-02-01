package Advanced2;

/**
 * @author Shivay Sabhawal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class JavaDocs_MethodTags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("Hello Java!!! Main Method");
    }

    /**
     * Hello Everyone!!! This is a method description.
     * @param a This is the first number to pass for addition.
     * @param b This is the second number to pass for addition.
     * @return The sum of two numbers passed previously as an integer.
     * @throws Exception if 'a' is 0.
     * @deprecated This method is deprecated, please use + operator
     */
    public int add(int a, int b) throws Exception{
        if (a == 0){
            throw new Exception();
        }
        int c = 0;
        c = a + b;
        return c;
    }
}
