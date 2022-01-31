package Advanced2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Collections10_PracticeSet {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object i: ar){
            System.out.println(i);
        }

        HashSet<Integer> s = new HashSet<>();
        s.add(10);
        s.add(103);
        s.add(1022);
        s.add(101);
        s.add(10);
        System.out.println(s);

        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());


        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" +  c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
