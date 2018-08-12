package com.example.s.allgoalstest.data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    // annotation url
    // scores
    // scores/response
    @GET(" ")
    // /response/items/Overview/leagues
    Call<DataResponse> getMyJSON();
}
