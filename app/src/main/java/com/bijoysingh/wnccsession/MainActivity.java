package com.bijoysingh.wnccsession;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button done;
    EditText title, note;
    Switch save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        done = (Button) findViewById(R.id.done);
        title = (EditText) findViewById(R.id.title);
        note = (EditText) findViewById(R.id.note);
        save = (Switch) findViewById(R.id.save);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
