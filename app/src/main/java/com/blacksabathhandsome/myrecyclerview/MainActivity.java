package com.blacksabathhandsome.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAlkess;
    private ArrayList<Alkes> list = new ArrayList<>();
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAlkess = findViewById(R.id.rv_alkes);
        rvAlkess.setHasFixedSize(true);

        list.addAll(AlkessData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvAlkess.setLayoutManager(new LinearLayoutManager(this));
        ListAlkesAdapter listAlkesAdapter = new ListAlkesAdapter(list);
        rvAlkess.setAdapter(listAlkesAdapter);

        listAlkesAdapter.setOnItemClickCallback(new ListAlkesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Alkes data) {
                showSelectedAlkes(data);
            }
        });
    }

    private void showRecyclerGrid(){
        rvAlkess.setLayoutManager(new GridLayoutManager(this, 2));
        GridAlkesAdapter gridAlkesAdapter = new GridAlkesAdapter(list);
        rvAlkess.setAdapter(gridAlkesAdapter);

        gridAlkesAdapter.setOnItemClickCallback(new ListAlkesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Alkes data) {
                showSelectedAlkes(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode Card View";
                showRecyclerCardView();
                break;

            case R.id.action_about:
                movetoAbout();
                break;
        }
        setActionBarTitle(title);
    }

    public void movetoAbout (){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    private void showRecyclerCardView() {
        rvAlkess.setLayoutManager(new LinearLayoutManager(this));
        CardViewAlkesAdapter cardViewAlkesAdapter = new CardViewAlkesAdapter(list, this);
        rvAlkess.setAdapter(cardViewAlkesAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedAlkes(Alkes alkes) {
        Toast.makeText(this, "Kamu memilih " + alkes.getName(), Toast.LENGTH_SHORT).show();
    }
}
