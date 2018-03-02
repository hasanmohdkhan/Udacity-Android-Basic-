package com.example.hasanzian.myshowcase;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Adaptor mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        Spannable text = new SpannableString(actionBar.getTitle());
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, text.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        actionBar.setTitle(text);

        ArrayList<ListModel> list = new ArrayList<ListModel>();
        list.add(new ListModel(getString(R.string.project_title),getString(R.string.profile_info_intro),R.drawable.music));
        list.add(new ListModel(getString(R.string.project_title),getString(R.string.profile_info_intro),R.drawable.project));
        list.add(new ListModel(getString(R.string.project_title),getString(R.string.profile_info_intro),R.drawable.music));
        ListView listView = (ListView)findViewById(R.id.list);
        mAdapter = new Adaptor(this,list);
        listView.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        // Get the SearchView and set the searchable configuration


        return true;
    }
}
