package com.makeinfo.retroflower.network;

import android.test.suitebuilder.annotation.LargeTest;

import com.makeinfo.retroflower.model.Flower;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Gokul Balakrishnan on 4/4/2015.
 */
public interface api {

    @GET("/feeds/flowers.json")
    public void getData(Callback<List<Flower>> response);


}
