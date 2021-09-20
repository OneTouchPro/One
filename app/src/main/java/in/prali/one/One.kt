package `in`.prali.one

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import android.widget.Toast

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