package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Province> provincesList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        provincesList = loadDataFromJson();

        Log.d("JSON_TEST", "Loaded provinces: " + provincesList.size());

        ArrayAdapter<Province> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                provincesList
        );
        listView.setAdapter(adapter);
    }

    private ArrayList<Province> loadDataFromJson() {
        ArrayList<Province> list = new ArrayList<>();
        String json = readJsonFromAssets("data.json");
        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                list.add(new Province(obj.getString("province")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    private String readJsonFromAssets(String filename) {
        StringBuilder builder = new StringBuilder();
        try (InputStream is = getAssets().open(filename);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("JSON_TEST", "JSON content: " + builder.toString());
        return builder.toString();
    }
}
