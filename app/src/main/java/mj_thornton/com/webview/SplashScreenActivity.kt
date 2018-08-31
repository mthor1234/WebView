package mj_thornton.com.webview;

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.schedule


public class SplashScreenActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer().schedule(3000){
            val intent = Intent(applicationContext, WebViewActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}
