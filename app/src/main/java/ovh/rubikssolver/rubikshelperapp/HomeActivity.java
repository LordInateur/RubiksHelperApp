package ovh.rubikssolver.rubikshelperapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ovh.rubikssolver.rubikshelperapp.adapter.MyAdapter;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView lastScoresView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = this;

        lastScoresView = findViewById(R.id.list_last_scores);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        lastScoresView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        lastScoresView.setLayoutManager(mLayoutManager);


        String[] myDataset = new String[10];
        myDataset[0] = "Score 1 !";
        myDataset[1] = "Score 2 ! ";
        myDataset[2] = "Score 3 ! ";
        myDataset[3] = "Score 4 ! ";
        myDataset[4] = "Score 5 ! ";
        myDataset[5] = "Score 6 ! ";
        myDataset[6] = "Score 7 ! ";
        myDataset[7] = "Score 8 ! ";
        myDataset[8] = "Score 9 ! ";
        myDataset[9] = "Score 10 ! ";

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        lastScoresView.setAdapter(mAdapter);

        Button newResolution = findViewById(R.id.btn_new_resolution);
        newResolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, OpenCVTest.class);

                startActivity(intent);

            }
        });
    }
}
