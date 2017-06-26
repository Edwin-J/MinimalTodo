package com.example.minjae.minimaltodo;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolBar;
    FrameLayout container;
    LinearLayout noTodoContainer;
    ListView listView;
    ActionBar fab;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                Toast.makeText(this, "오케", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "오케이", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = (Toolbar) findViewById(R.id.main_toolbar);
        container = (FrameLayout) findViewById(R.id.contanier);
        noTodoContainer = (LinearLayout) findViewById(R.id.no_to_container);

        setSupportActionBar(toolBar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle(getString(R.string.app_name));
        }

        findViewById(R.id.main_floatingactionBar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
