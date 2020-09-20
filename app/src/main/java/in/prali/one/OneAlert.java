package in.prali.one;
import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class OneAlert {

//Note
// OneAlert(x,x,x,x,
// new DialogInterface.OnClickListener()
// new DialogInterface.OnClickListener()
// );
//Note

    public OneAlert(Context MyContext, String Title, String Message, Boolean Cancelable, String PositiveText, String NegativeText, DialogInterface.OnClickListener onPositiveClickListener, DialogInterface.OnClickListener onNegativeClickListener) {
        new AlertDialog.Builder(MyContext)
                .setTitle(Title)
                .setMessage(Message)
                .setCancelable(Cancelable)
                .setPositiveButton(PositiveText, onPositiveClickListener)
                .setNegativeButton(NegativeText, onNegativeClickListener)
                .create()
                .show();
    }

    public OneAlert(Context MyContext, String Title, String Message, Boolean Cancelable, String PositiveText, DialogInterface.OnClickListener onPositiveClickListener) {
        new AlertDialog.Builder(MyContext)
                .setTitle(Title)
                .setMessage(Message)
                .setCancelable(Cancelable)
                .setPositiveButton(PositiveText, onPositiveClickListener)
                .create()
                .show();
    }

}
