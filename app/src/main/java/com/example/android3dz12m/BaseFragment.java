package com.example.android3dz12m;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;


public abstract class BaseFragment<Binding> extends Fragment {

    protected Binding binding;

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize();
        setObserve();
        setListener();
        setupViews();
    }


    protected void setObserve() {

    }

    protected void setListener() {

    }

    protected void setupViews() {

    }

    protected void initialize() {

    }
}