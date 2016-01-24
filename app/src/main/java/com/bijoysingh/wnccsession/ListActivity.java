package com.bijoysingh.wnccsession;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView =
                (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<NoteItem> notes = new ArrayList<>();

        notes.add(new NoteItem("Some Random Title", "This is my notes 1"));
        notes.add(new NoteItem("Some Totally Random Title", "This is my notes 2"));
        notes.add(new NoteItem("Some Random Title", "This is my notes 3"));
        notes.add(new NoteItem("Some Random Title", "This is my notes 4"));

        NoteListAdapter adapter= new NoteListAdapter(this, notes);
        recyclerView.setAdapter(adapter);
    }
}
