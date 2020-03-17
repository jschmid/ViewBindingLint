package pro.schmid.viewbindinglint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pro.schmid.viewbindinglint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = "Hello from Activity"
    }
}
