package com.example.android3dz12m.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.android3dz12m.BaseFragment;
import com.example.android3dz12m.OnClick;
import com.example.android3dz12m.adapter.BookAdapter;
import com.example.android3dz12m.databinding.FragmentBookBinding;
import com.example.android3dz12m.models.BookModel;
import com.example.android3dz12m.models.BookViewModel;

import java.util.List;

public class BookFragment extends BaseFragment<FragmentBookBinding> {


    private BookAdapter adapter = new BookAdapter();
    private BookViewModel viewModel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    private void openAboutFragment() {
        adapter.setOnClick(new OnClick() {
            @Override
            public void getSmt(BookModel model, View view) {
                Navigation.findNavController(view).navigate(BookFragmentDirections.actionBookFragmentToAboutFragment(model).setBook(model));
            }
        });
    }

    private void setBtnOpenRec() {
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btn.setVisibility(View.GONE);
                viewModel.addAll();
            }
        });
    }

    private void setRecycler() {
        binding.frameLay.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.frameLay.setAdapter(adapter);

    }

    @Override
    protected void setObserve() {
        viewModel.listM.observe(getViewLifecycleOwner(), new Observer<List<BookModel>>() {
            @Override
            public void onChanged(List<BookModel> bookModels) {
                binding.btn.setVisibility(View.GONE);
                adapter.setIn(bookModels);
            }
        });
    }

    @Override
    protected void setListener() {
        setBtnOpenRec();
        openAboutFragment();
    }

    @Override
    protected void setupViews() {
        setRecycler();
    }

    @Override
    protected void initialize() {
        viewModel = new ViewModelProvider(this).get(BookViewModel.class);
    }
}