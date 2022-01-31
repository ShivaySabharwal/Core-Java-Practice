package Advanced2;

//  Question: Is it safe to store the number of milliseconds in a variable of type long?
//  Answer: Yes, it is absolutely safe to store the number of milliseconds in a variable of type long because
//  the maximum value that can be stored in long is 9223372036854775807. You can see that the maximum value of
//  long is huge. Therefore, we do not need to worry about the value of milliseconds. Notice the output of the
//  below code; the value of current time in millisecond is 10^6 times smaller than the maximum value of long data type.


import java.util.Date;

/**
 * This class is to demonstrate what datetime is and how it is used in the java industry
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class Collection5_DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(Long.MAX_VALUE);

        Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);

        Date d2= new Date(2021,12, 24);  //both dates are different
        System.out.println(d2.compareTo(d));

        Date d3= new Date(2021,5,23);
        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d3.getTime() );

        Date d4= new Date();
        System.out.println("The current date is : "+ d4.getDate());
        System.out.println("The current year is : "+ d4.getYear()); //19

        Date d5 = new Date();
        System.out.println(d5);
        System.out.println(d5.getTime());
        System.out.println(d5.getDate());
        System.out.println(d5.getSeconds());
        System.out.println(d5.getYear());
    }
}
