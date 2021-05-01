package com.example.potterapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PotterService {

    @GET("characters")
    Call<List<Wizard>> getCharacters();

}
