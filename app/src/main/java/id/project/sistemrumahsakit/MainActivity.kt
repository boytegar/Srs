package id.project.sistemrumahsakit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.florent37.runtimepermission.kotlin.askPermission

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        askPermission {
            Toast.makeText(this, "Permission All Check", Toast.LENGTH_SHORT)
        }.onDeclined { e ->
            //at least one permission have been declined by the user
        }
    }
}
