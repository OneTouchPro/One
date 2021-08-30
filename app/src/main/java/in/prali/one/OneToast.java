package in.prali.one;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class OneToast {

    public OneToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
