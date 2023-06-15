package com.example.shopiifytask.data;

import com.example.shopiifytask.model.ProductsModel;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.http.GET;

public interface IProductsApi {

    @GET("products")
    public Call<ArrayList<ProductsModel>> getProducts();

}
