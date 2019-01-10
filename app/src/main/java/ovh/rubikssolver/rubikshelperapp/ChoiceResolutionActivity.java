package ovh.rubikssolver.rubikshelperapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceResolutionActivity extends AppCompatActivity {
    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_resolution);

        context = this;

        Button newResolution = findViewById(R.id.btn_learn);
        newResolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SolverActivity.class);

                startActivity(intent);

            }
        });
    }
}
