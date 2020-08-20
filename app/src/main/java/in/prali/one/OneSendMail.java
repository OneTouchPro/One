package in.prali.one;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class OneSendMail {
    public OneSendMail(Context context, String mailid, String subject) {
        Intent j = new Intent(Intent.ACTION_SENDTO);
        j.setData(Uri.parse("mailto:" + mailid +
                "?subject=" + subject));
        j.putExtra(Intent.EXTRA_SUBJECT, subject);
        context.startActivity(Intent.createChooser(j, "Select your mail account to send mail"));
    }

}
