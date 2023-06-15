package com.example.shopiifytask.data;

import com.example.shopiifytask.model.ProductsModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsBuilder {

    private static final String BASE_URL = "https://fakestoreapi.com/";
    private IProductsApi iProductsApi;
    private static ProductsBuilder INSTANCE;

    //Create a retrofit implimantation
    public ProductsBuilder() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        iProductsApi = retrofit.create(IProductsApi.class);
    }

    public static ProductsBuilder getInstance(){
        if (null == INSTANCE) {
            INSTANCE = new ProductsBuilder();
        }
        return INSTANCE;
    }

    public Call<ArrayList<ProductsModel>> getProducts(){
        return iProductsApi.getProducts();
    }

}
