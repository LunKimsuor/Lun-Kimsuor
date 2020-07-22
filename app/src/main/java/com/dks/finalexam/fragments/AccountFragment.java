package com.dks.finalexam.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dks.finalexam.R;
import com.squareup.picasso.Picasso;

public class AccountFragment extends Fragment {
    private ImageView image;
    private TextView name;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        image = view.findViewById(R.id.profile_image);

        Picasso.get().load(
                "https://rupp-ite.s3-ap-southeast-1.amazonaws.com/profile.jpg").into(image);
    }
}

