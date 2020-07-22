package com.dks.finalexam.adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dks.finalexam.R;
import com.dks.finalexam.models.Product;
import com.dks.finalexam.viewholders.ProductViewHolder;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    List<Product> products;

    public ProductAdapter() {
        products = null;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.viewholder_product, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.getProduct_image().setImageURI(Uri.parse(product.getProduct_image()));
        holder.getProduct_title().setText(product.getProduct_name());
        holder.getProduct_price().setText("$" + product.getProduct_price());
        holder.getProduct_rate().setText(product.getProduct_averageRate() + "");
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}

