package soogaco.app.medstopquestionnaire.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import soogaco.app.medstopquestionnaire.R;
import soogaco.app.medstopquestionnaire.databinding.ActivityQuestionnaireBinding;

public class QuestionnaireActivity extends AppCompatActivity {

    private ActivityQuestionnaireBinding binding;
    private String TAG ="QuestionnaireActivity - Class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionnaireBinding.inflate(getLayoutInflater());
        View view =  binding.getRoot();
        setContentView(view);

        binding.nextButton.setOnClickListener(V -> goNext());
    }

    private void goNext() {
        Intent intent = new Intent(this, TreatmentCardActivity.class);
        startActivity(intent);
        Log.i(TAG, "Start new Activity" + "-------------------------");
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}