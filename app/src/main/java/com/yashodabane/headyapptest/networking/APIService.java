package com.yashodabane.headyapptest.networking;


import com.yashodabane.headyapptest.models.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("json")
    Call<BaseModel> getDetails();
}
