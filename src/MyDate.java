import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


 public class MyDate {
    public static void mainn(){
        DateFormat format=new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println(format.format(new Date()));
    }
 }
