package com.example.android3dz12m.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android3dz12m.BaseFragment;
import com.example.android3dz12m.databinding.FragmentAboutBinding;
import com.example.android3dz12m.models.BookModel;

public class AboutFragment extends BaseFragment<FragmentAboutBinding> {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    protected void initialize() {
        setupDescription();
    }

    private void setupDescription() {
        BookModel model = AboutFragmentArgs.fromBundle(getArguments()).getBook();
        binding.headerTxt.setText(model.getTitle());
        binding.descTxt.setText(model.getDescr());
        binding.backImage.setImageResource(model.getIcon());
    }
}
