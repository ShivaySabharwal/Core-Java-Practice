package Advanced2;

//Below is the list of the JavaDoc tags :
//   Tag                 Syntax                                      Description
//@author          @author name-text                       Describes the author of a class.
//@version         @version version-number                 Adds a "Version" heading which specifies the current version of the release or file.
//@since           @since release-date                     Adds a "Since" heading that tells about the release date.
//@see 	           @see <a href="reference"></a>           Adds a "See Also" heading that refers to the other element of the documentation.
//@return          @return return-description              Adds a "Return" description that tells about the return value of the method.
//@param           @param param-description                Provides the information about the method parameters in the "Parameters" section.
//@throws          @exception exception-name description   Displays the exception that can be thrown by a method ( same as @exception)
//{@code}          {@code text}                            Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.
//@deprecated      @deprecated deprecatedtext              Adds a "Deprecated" heading indicating that this API should no longer be used.

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class JavaDocs1 {
    public void add(int a, int b){
        System.out.println("The sum is: " + a+b);
    }
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
