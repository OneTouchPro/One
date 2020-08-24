package in.prali.one;
import android.app.ProgressDialog;
import android.content.Context;

public class OneProgress {

    ProgressDialog mProgress;

    public OneProgress(Context context) {
        mProgress = new ProgressDialog(context);
        mProgress.setMessage(" Please wait...");
        mProgress.setCancelable(false);
    }
    public void show(){
        mProgress.show();
    }

    public void dismiss(){
        mProgress.dismiss();
    }
}
