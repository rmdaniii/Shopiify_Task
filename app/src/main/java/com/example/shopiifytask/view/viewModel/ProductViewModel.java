package com.example.shopiifytask.view.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.shopiifytask.data.ProductsBuilder;
import com.example.shopiifytask.model.ProductsModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductViewModel extends ViewModel {

    public MutableLiveData <ArrayList<ProductsModel>> productMutableLiveData = new MutableLiveData<>();

    public void getProducts(){
        ProductsBuilder.getInstance().getProducts().enqueue(new Callback<ArrayList<ProductsModel>>() {
            @Override
            public void onResponse(Call<ArrayList<ProductsModel>> call, Response<ArrayList<ProductsModel>> response) {
                productMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<ProductsModel>> call, Throwable t) {
            }
        });
    }

}
