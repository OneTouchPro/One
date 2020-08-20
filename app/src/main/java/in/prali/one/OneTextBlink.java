package in.prali.one;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class OneTextBlink {

    public OneTextBlink() {

    }

    public OneTextBlink(final TextView textView, final int SecondsToBlink) {
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(SecondsToBlink);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(textView.getVisibility() == View.VISIBLE){
                            textView.setVisibility(View.INVISIBLE);
                        } else {
                            textView.setVisibility(View.VISIBLE);
                        }
                        new OneTextBlink(textView,SecondsToBlink);
                    }
                });
            }
        }).start();
    }
}
