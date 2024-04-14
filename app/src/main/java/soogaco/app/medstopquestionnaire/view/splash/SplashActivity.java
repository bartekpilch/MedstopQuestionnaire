package soogaco.app.medstopquestionnaire.view.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import soogaco.app.medstopquestionnaire.R;
import soogaco.app.medstopquestionnaire.view.main.QuestionnaireActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Po zakończeniu czasu, uruchom główną aktywność
                Intent mainIntent = new Intent(SplashActivity.this, QuestionnaireActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}