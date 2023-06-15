package com.example.shopiifytask.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopiifytask.R;
import com.example.shopiifytask.model.ProductsModel;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ArrayList<ProductsModel> productsModels = new ArrayList<>();

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {

        holder.title_tv.setText(productsModels.get(position).getTitle());
        holder.price_tv.setText(productsModels.get(position).getPrice()+"");
        holder.product_img.setImageResource(productsModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return productsModels.size();
    }

    public  void setList(ArrayList<ProductsModel> productsModels){
        this.productsModels = productsModels;
        notifyDataSetChanged();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView title_tv , price_tv;
        ImageView product_img;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            title_tv = itemView.findViewById(R.id.product_title_tv);
            price_tv = itemView.findViewById(R.id.product_price_tv);
            product_img = itemView.findViewById(R.id.product_img);

        }
    }

}
