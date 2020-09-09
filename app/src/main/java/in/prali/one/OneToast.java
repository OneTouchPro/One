package in.prali.one;
import android.content.Context;
import android.widget.Toast;

public class OneToast {


    public OneToast (Context context, String message){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
