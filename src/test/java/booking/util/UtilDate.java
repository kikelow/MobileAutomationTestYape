package booking.util;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UtilDate {

    public static String getDateWithFormat(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMMM yyyy",new Locale("en-US"));
        return simpleDateFormat.format(date);
    }

    public static DateTime getDateTimeInstance(){
        return new DateTime();
    }

}
