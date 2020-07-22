package com.dks.finalexam.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    private ImageView product_image;
    private TextView product_title;
    private TextView product_price;
    private TextView product_rate;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public ImageView getProduct_image() {
        return product_image;
    }

    public void setProduct_image(ImageView product_image) {
        this.product_image = product_image;
    }

    public TextView getProduct_title() {
        return product_title;
    }

    public void setProduct_title(TextView product_title) {
        this.product_title = product_title;
    }

    public TextView getProduct_price() {
        return product_price;
    }

    public void setProduct_price(TextView product_price) {
        this.product_price = product_price;
    }

    public TextView getProduct_rate() {
        return product_rate;
    }

    public void setProduct_rate(TextView product_rate) {
        this.product_rate = product_rate;
    }
}
