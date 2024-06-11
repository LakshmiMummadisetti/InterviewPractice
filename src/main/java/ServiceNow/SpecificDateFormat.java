package ServiceNow;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SpecificDateFormat {
    public static void main(String args[])
    {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/dd/mm");
        String str = sd.format(date);
        System.out.println(str);

    }
}
