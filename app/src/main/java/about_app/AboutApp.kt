// AboutApp

package about_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financecontrol.BuildConfig
import com.example.financecontrol.R
import kotlinx.android.synthetic.main.activity_about_app.*

class AboutApp : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        // узнаём версию приложения
        val appVersion = BuildConfig.VERSION_NAME

        // компонуем строку-описание приложения
        val textAboutApp = "${getText(R.string.text_about_app)} $appVersion"

        // вставляем описание приложения в TextView
        tv_about_app.text = textAboutApp
    }
}