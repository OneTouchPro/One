package `in`.prali.one

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun Context.OneToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Context.OneCopyToClipBoard(label: String?, text: String?) {
    val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText(label, text)
    clipboard.setPrimaryClip(clip)
}

fun Context.OneVersion(): String? {
    var version: String? = null
    try {
        val pInfo = packageManager.getPackageInfo(packageName, 0)
        version = pInfo.versionName
    } catch (e: PackageManager.NameNotFoundException) {
        e.printStackTrace()
    }
    return version
}

fun OneTextBlink(textView: TextView, SecondsToBlink: Int) {
    val handler = Handler(Looper.myLooper()!!)
    Thread {
        try {
            Thread.sleep(SecondsToBlink.toLong())
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        handler.post {
            if (textView.visibility == View.VISIBLE) {
                textView.visibility = View.INVISIBLE
            } else {
                textView.visibility = View.VISIBLE
            }
            OneTextBlink(textView, SecondsToBlink)
        }
    }.start()
}

fun Context.OneOpenURL(linkURL: String?) {
    val inte = Intent(Intent.ACTION_VIEW)
    inte.data = Uri.parse(linkURL)
    startActivity(inte)
}

fun Context.OneHideKeyBoard(view: View) {
    val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
    view.clearFocus()
}

fun Context.OneLoadImage(imageURL: String?, view: ImageView) {
    Picasso.get().load(imageURL).into(view)
}

fun Context.OneLaunchSmoothActivity(clas: Class<*>?) {
    startActivity(Intent(this, clas))
    (applicationContext as Activity).overridePendingTransition(0, android.R.anim.fade_out)
}



