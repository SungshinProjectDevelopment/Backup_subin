package org.androidtown.muksujung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MineList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_list);

        Button new_mine = (Button) findViewById(R.id.btn_mine_new);
        ListView listView = (ListView) findViewById(R.id.minelist);

    }

    public void onClick(View v){
        if(v.getId() == R.id.btn_mine_new)
                startActivity(new Intent(this, AddMine.class));
                //finish();
        }
    }
