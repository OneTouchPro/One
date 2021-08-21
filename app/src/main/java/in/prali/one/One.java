package in.prali.one;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class One {

    public void CopyToClipBoard(Context context, String lable, String text) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(lable, text);
        clipboard.setPrimaryClip(clip);
    }
}
