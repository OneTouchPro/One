package in.prali.one;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class One {

    public Context context;

    public One() {
    }

    public void CopyToClipBoard(Context context, String lable, String text) {
        this.context=context;
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(lable, text);
        clipboard.setPrimaryClip(clip);
    }

    public void Toast(Context context, String message) {
        this.context=context;
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public String Version(Context context){
        this.context=context;
        String version = null;
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
