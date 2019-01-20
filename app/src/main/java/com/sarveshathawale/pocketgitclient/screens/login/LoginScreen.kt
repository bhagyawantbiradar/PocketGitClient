package com.sarveshathawale.pocketgitclient.screens.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sarveshathawale.pocketgitclient.R
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        btnLoginWithGithub.setOnClickListener {
            //todo: Will open the browser to authenticate the user and after successful authentication redirect the user to the app again.
        }
    }
}
