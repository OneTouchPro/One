package in.prali.one;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class OneVersion {

    public static String Check(Context context){
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
