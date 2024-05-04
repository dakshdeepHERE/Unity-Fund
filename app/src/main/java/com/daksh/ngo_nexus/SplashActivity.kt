import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.daksh.ngo_nexus.MainActivity
import com.daksh.ngo_nexus.R

class SplashActivity : AppCompatActivity() {

    // Splash screen duration in milliseconds
    private val SPLASH_DURATION: Long = 2000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Handler to post a delayed action
        Handler().postDelayed({
            // Start the main activity after the splash screen duration
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish() // Finish the splash activity
        }, SPLASH_DURATION)
    }
}
