package in.prali.one;

import android.content.Context;
import android.widget.Toast;

public class OneToast {

    private Context context;

    public OneToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
