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

    public void CopyToClipBoard(String lable, String text) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(lable, text);
        clipboard.setPrimaryClip(clip);
    }

    public void Toast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public String Version(){
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
