package com.example.potterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ImageView characterImage;
    private TextView characterName;
    private Button nextBtn;
    private Button detailsBtn;
    int index = 0;
    private List<Wizard> res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterImage = findViewById(R.id.imageView);
        characterName = findViewById(R.id.textView);
        nextBtn = findViewById(R.id.button);
        detailsBtn = findViewById(R.id.button2);

        //retrofit setup

        //retrofit instance
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://hp-api.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // connect service to instance
        PotterService potterService = retrofit.create(PotterService.class);

        //call the api
        potterService.getCharacters().enqueue(new Callback<List<Wizard>>() {
            @Override
            public void onResponse(Call<List<Wizard>> call, Response<List<Wizard>> response) {
                res = response.body();
                characterName.setText(res.get(0).getName());
                Glide.with(MainActivity.this).load(res.get(0).getImage()).into(characterImage);
            }

            @Override
            public void onFailure(Call<List<Wizard>> call, Throwable t) {

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rn = new Random(System.currentTimeMillis());
                index = rn.nextInt(res.size() - 1) - 1;
                Wizard wiz = res.get(index);
                characterName.setText(wiz.getName());
                Glide.with(MainActivity.this).load(wiz.getImage()).into(characterImage);
            }
        });
    }
}