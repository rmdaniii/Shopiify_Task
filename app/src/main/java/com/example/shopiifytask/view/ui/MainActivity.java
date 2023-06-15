package com.example.shopiifytask.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import com.example.shopiifytask.R;
import com.example.shopiifytask.model.ProductsModel;
import com.example.shopiifytask.view.adapter.ProductAdapter;
import com.example.shopiifytask.view.viewModel.ProductViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ProductViewModel productViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewModel
        productViewModel = ViewModelProviders.of(this).get(ProductViewModel.class);
        productViewModel.getProducts();

        //RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler);
        final ProductAdapter adapter = new ProductAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        productViewModel.productMutableLiveData.observe(this, new Observer<ArrayList<ProductsModel>>() {
            @Override
            public void onChanged(ArrayList<ProductsModel> productsModels) {
                adapter.setList(productsModels);
            }
        });

    }
}