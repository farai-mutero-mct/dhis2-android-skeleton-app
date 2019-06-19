package com.example.android.androidskeletonapp.ui.base;

import com.example.android.androidskeletonapp.data.service.ActivityStarter;
import com.example.android.androidskeletonapp.ui.main.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class ListActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;

    protected void setUp(int contentViewId, int toolbarId, int recyclerViewId) {
        setContentView(contentViewId);
        Toolbar toolbar = findViewById(toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = findViewById(recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onSupportNavigateUp() {
        ActivityStarter.startActivity(this, MainActivity.class);
        return true;
    }

    @Override
    public void onBackPressed() {
        ActivityStarter.startActivity(this, MainActivity.class);
    }
}
