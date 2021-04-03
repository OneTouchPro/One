package in.prali.one;

import android.annotation.SuppressLint;
import com.google.firebase.Timestamp;

import java.text.SimpleDateFormat;
import java.util.Date;


public class OneConversion {

    public static String DateToString(Timestamp timestamp, String format) {
        Date date = timestamp.toDate();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat formatter = new SimpleDateFormat(format);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }
}
